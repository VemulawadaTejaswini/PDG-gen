class Main
  str = gets
  str = str.split(" ")
  w = str[0]
  h = str[1]
  x = str[2]
  y = str[3]
  r = str[4]
  if w >= (x + r) && h >= (y + r) && 0 <= (x - r) && 0 <= (y - r)
    puts "Yes"
  else 
    puts "No"
  end
end
