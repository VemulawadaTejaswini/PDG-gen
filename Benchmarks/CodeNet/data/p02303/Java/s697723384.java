# #### CLOSEST PAIR O(N LOG N) ALGORITHM #### #
# points should be unique, otherwise the closest pair would be the repeated points
# also this will only find 1 pair with the smallest distance, in case there are multiple pairs with this same minimum distance

#import time
#start = time.time()


def dist(x, y): # for two points x(x0,x1) and y(y0,y1), what is the squared distance? 
	return (x[0] - y[0]) ** 2 + (x[1] - y[1]) ** 2
	
def splitpair(px, py, d): # only need to return a value if closest pair is split between left and right halves
	xBar = px[(len(px)+1)/2][0] # large x-coordinate of the left half of px
	Sy = [] # Sy will be the set of points (sorted by Y-coordinate) where the x-coord xi satisfies xBar-d <= xi <= xBar -d
	for i in xrange(len(py)):
		if xBar-d**0.5 <= py[i][0] <= xBar+d**0.5: # only consider a 'strip' around xBar that is 2*sqrt(d) wide
			Sy.append(py[i]) # if exists a pair with dist less than d, it must be in this strip (obvious)	
	
	bestpair = None # the coords of the best pair of points so far
	bestD = d # the squared distance of the best pair of points
	# now iterate through Sy for points that aren't more than 7 apart
	# if a pair exists that is closer than dist d, it must be within 7 of each other
	# ask me for proof if you haven't seen this observation before it's pretty cool
	for i in xrange(len(Sy)-2):
		for j in xrange(1, min(8, len(Sy)-i-1)):  # 7 next points
			p, q = Sy[i], Sy[i+j]
			
			if dist(p, q) < bestD:
				bestpair = [p, q]
				bestD = dist(p, q)
				
	return bestpair
	
def convert(p1, p2): # convert 2 points into two pairs of pairs, first sorted by x, other sorted by y
	return [sorted([p1, p2]), sorted([p1, p2], key=lambda x: x[1])]
	
def solve(Px, Py): # where Px and Py are the points sorted by x and y coordinate respectively
	# this function returns two closest points
	if len(Px) == 2:
		return (Px, Py)
	elif len(Px) == 3: # 3 points, brute force
		p1, p2, p3 = [x for x in Px]
		d12, d13, d23 = dist(p1, p2), dist(p1, p3), dist(p2, p3)
		if min(d12, d13, d23) == d12: 
			return convert(p1, p2)
		elif min(d12, d13, d23) == d13: 
			return convert(p1, p3)
		else: 
			return convert(p2, p3)
	else:
		# split the left and right halves of all points (by x coord)
		L = len(Px)
		Qx, Rx = Px[:L/2], Px[L/2:]
		Qy, Ry = [], []
		k, l = Qx[-1][0], Qx[-1][1] # x and y coords of the rightmost element in Qx
		for pt in Py: # this is linear time, you loop through Py exactly once.
			# need this in order 
			if pt[0] < k:
				Qy.append(pt)
			elif pt[0] == k:
				if pt[1] <= l:
					Qy.append(pt)
				else:
					Ry.append(pt)
			else:
				Ry.append(pt)
		
		# now use recursion. note ci is of the form [[x1,x2], [y1,y2]]
		c1 = solve(Qx, Qy) # find the closest pair in left half
		c2 = solve(Rx, Ry) # find the closest pair in the right half
		
		D = min(dist(c1[0][0], c1[0][1]), dist(c2[0][0], c2[0][1])) # get the min distance of both of these to solve split case
		if D == dist(c1[0][0], c1[0][1]):
			bestpair = c1
		elif D == dist(c2[0][0], c2[0][1]):
			bestpair = c2
		
		c3 = splitpair(Px, Py, D) # find the closest split pair. this needs to be O(n) to get O(n log n) for entire algo
		
		if c3 is not None: 
			return convert(c3[0], c3[1])
		else:
			return [bestpair[0], bestpair[1]] # else it's one of the c1 or c2
		
		
def main():
	N = int(raw_input().split()[0]) # N is number of points
	pts = [] # pairs of points, i.e pts = [[x1,y1], [x2,y2], ... , [xn,yn]]
	
	# get all pairs of points into our list
	for i in xrange(N):
		pts.append([float(x) for x in raw_input().split()])
		
	Px = sorted(pts) # sort the pts by x coordinate
	Py = sorted(pts, key=lambda x: x[1]) # sort the pts by y coordinate
	
	res = solve(Px, Py) # keep one copy sorted by x coord, the other sorted by y coord to keep the split in half in linear time
	
	print "%.10f" % (dist(res[0][0], res[0][1]) ** 0.5)

if __name__ == '__main__':
	main()


#print "%.2f %s" % (((time.time() - start) * 1000), "ms")