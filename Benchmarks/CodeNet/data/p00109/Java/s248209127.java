def calc(array):
	while not len(array) == 1:
		if '*' in array:
			x = array.index('*')
			array[x + 1] = str(int(array[x - 1]) * int(array[x + 1]))
			del array[x - 1:x + 1]
			continue
		if '/' in array:
			x = array.index('/')
			array[x + 1] = str(int(array[x - 1]) / int(array[x + 1]))
			del array[x - 1:x + 1]
			continue
		if '-' in array:
			x = array.index('-')
			array[x + 1] = str(int(array[x - 1]) - int(array[x + 1]))
			del array[x - 1:x + 1]
			continue
		if '+' in array:
			x = array.index('+')
			array[x + 1] = str(int(array[x - 1]) + int(array[x + 1]))
			del array[x - 1:x + 1]
			continue
	return str(array[0])

n = input()
for i in xrange(n):
	array = list(raw_input())
	
	while '(' in array:
		x1 = array.index('(') + 1
		x2 = array.index(')')
		jon = array[x1:x2]
		array[x2] = calc(jon)
		del array[x1 - 1:x2]
	print calc(array[0:len(array) - 1])