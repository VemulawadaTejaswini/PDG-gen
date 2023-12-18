import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLong()){
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=GCD(a,b);
    long d=a*b/c;
    System.out.println(c+" "+d);
    
    }
   }
   public static long GCD(long a,long b){
   long c=a;
   long d=b;
   long r=0;
       while( (r = c % d) != 0 ) {
            c = d;
            d = r;
        }
        return d;
   }
   }
    