s = Hash.new
nums = Array.new
while (line = gets) != "\n" do
  num,=line.split(",").map(&:to_i)
  s[num]||=0
  s[num]+=1
end
while line = gets do
  num,=line.split(",").map(&:to_i)
  next unless s[num]
  nums << num
  s[num]+=1
end
nums.sort!
nums.each{|n|
  puts n.to_s+" "+s[n].to_s
}