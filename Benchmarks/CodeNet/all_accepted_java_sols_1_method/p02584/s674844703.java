


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
               long x=scan.nextLong();
               long k=scan.nextLong();
               long d=scan.nextLong();
               x=Math.abs(x);
               if(x>0 && (x/d)>=k){
                   long qq=x/d;
                   x=x-k*d;
                   System.out.print(x);
                   return;
               }
               long y=x/d;
               x=x-y*d;
               k=k-y;
               if(k%2==0){
                   System.out.print(Math.abs(x));
               }else{
                   System.out.print(Math.min(Math.abs(x-d),Math.abs(x+d)));
               }
    }
}
