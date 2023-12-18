### constant

MAX_INT = (1 << 31) - 1

### subroutines

def dist(nd0, nd1)
  (nd0[0] - nd1[0]).abs + (nd0[1] - nd1[1]).abs
end

### main

while true
  w, h = gets.strip.split(' ').map{|s| s.to_i}
  break if w == 0 && h == 0

  nodes = 7.times.map{[]}
  start = nil
  goal = nil

  for y in (0...h)
    hl = gets.strip.split('')
    for x in (0...w)
      case hl[x]
      when 'S'
        start = [x, y, 0]
        nodes[5] << start
      when 'G'
        goal = [x, y, MAX_INT]
        nodes[6] << goal
      when '1'..'5'
        attr = hl[x].to_i - 1
        nodes[attr] << [x, y, MAX_INT]
      end
    end
  end

  min_dist = MAX_INT
  min_attr = nil

  for sattr in (0..4)
    attrs = [5] + (1..4).map{|k| (sattr + k) % 5} + [6]

    start[2] = 0
    goal[2] = MAX_INT

    for k in (1..5)
      prev_attr = attrs[k - 1]
      attr0 = attrs[k]

      for nd0 in nodes[attr0]
        min_dist0 = MAX_INT
        for p_nd in nodes[prev_attr]
          d = p_nd[2] + dist(p_nd, nd0)
          min_dist0 = d if min_dist0 > d
        end

        nd0[2] = min_dist0
      end
    end

    if goal[2] < MAX_INT && min_dist > goal[2]
      min_dist = goal[2]
      min_attr = sattr
    end
  end

  if min_attr.nil?
    puts 'NA'
  else
    puts [min_attr + 1, min_dist].join(' ')
  end
end