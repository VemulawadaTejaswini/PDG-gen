class Main
  while(true)
    str = gets
    str = str.split(" ")
    str.map { |x| x.to_i }
    str.sort_by! { |n| n }
    break if str[0] == 0
    puts "#{str[0]} #{str[1]}"
  end
end
