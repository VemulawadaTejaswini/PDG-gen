### constant

MAX_INT = 1 << 30

### main

loop do
  r = gets.strip.to_i
  break if r == 0

  mlss = []

  for k in (0..1)
    w, h, ex, ey = gets.strip.split(' ').map{|s| s.to_i}
    ex -= 1
    ey -= 1
    als = h.times.map{gets.strip.split(' ').map{|s| s.to_i}}

    mls = h.times.map{w.times.map{MAX_INT}}
    visited = h.times.map{w.times.map{false}}

    mls[ey][ex] = als[ey][ex]
    visited[ey][ex] = als[ey][ex]
    q = [[ex, ey]]
    mlq = []

    while ! q.empty?
      u = q.min{|a, b| mls[a[1]][a[0]] <=> mls[b[1]][b[0]]}
      q.delete u

      x, y = u

      mlq << mls[y][x]
      break if mlq.length > r

      nbrs = []
      nbrs << [x - 1, y] if x > 0
      nbrs << [x + 1, y] if x < w - 1
      nbrs << [x, y - 1] if y > 0
      nbrs << [x, y + 1] if y < h - 1

      for v in nbrs
        vx, vy = v
        l = [mls[y][x], als[vy][vx]].max

        if mls[vy][vx] > l
          mls[vy][vx] = l
          if ! visited[vy][vx]
            visited [vy][vx] = true
            q << [vx, vy]
          end
        end
      end
    end

    mlss << [0] + mlq
  end
  #p mlss

  min_sum = MAX_INT

  mlen0 = mlss[0].length
  mlen1 = mlss[1].length

  i0 = 0
  i1 = r - i0

  if i1 >= mlen1
    i1 = mlen1 - 1
    i0 = r - i1
  end

  while i0 < mlen0 && i1 >= 0
    sum = mlss[0][i0] + mlss[1][i1]
    min_sum = sum if min_sum > sum

    i0 += 1
    i1 -= 1
  end

  puts min_sum
end