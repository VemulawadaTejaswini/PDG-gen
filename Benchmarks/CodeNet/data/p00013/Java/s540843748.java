rail = []
while line = gets
  car = line.to_i
  if car == 0
    p rail.pop
  else
    rail << car
  end
end