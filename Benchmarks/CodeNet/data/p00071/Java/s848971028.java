s=gets.to_i
for i in 1..s
    gets.chomp
    num=[]
    8.times do
        num<<gets.chomp.split(//).map(&:to_i)
    end
    x=gets.to_i-1
    y=gets.to_i-1
    
    check=[x,y]
    until check.empty?
        y=check.pop
        x=check.pop
        
        (-3).upto(3) do |t|
            if (x+t)<8 && 0<=(x+t) && num[y][x+t]==1
                check<<(x+t).to_i
                check<<y.to_i
                num[y][x+t]=0
            end
            if (y+t)<8 && 0<=(y+t) && num[y+t][x]==1
                check<<x.to_i
                check<<(y+t).to_i
                num[y+t][x]=0
            end
        end
    end
    puts "Data #{i}:"
    8.times{ |t| puts num[t].join}
end