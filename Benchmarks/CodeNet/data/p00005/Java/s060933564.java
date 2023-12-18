import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextLong()){
long a=sc.nextLong();
long b=sc.nextLong();
long c=gcd(a,b);
long d=(a*b)/c;
System.out.println(c+" "+d);
}
}
public static long gcd(long x,long y){
long max=Math.max(x,y);
long min=Math.min(x,y);
long amari=max%min;
if(amari==0){return min;}
else{return gcd(min,amari);}
}
}