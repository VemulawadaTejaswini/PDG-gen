while line = gets do
  ans = eval(line.chomp.chop)
  puts (ans<0||ans>9999) ? "E" : ans
end