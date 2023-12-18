import java.util.*;
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   long n = sc.nextInt();
   long d = sc.nextInt();
   long res=0;
    while(n-->0) {
    long x = sc.nextInt();
    long y = sc.nextInt();
    //int res =0;
    double dis =  Math.sqrt(x*x+y*y);
    
   int dis1 = (int)Math.ceil(dis);
    if(d>=dis)
    res += 1;
     }
    System.out.println(res);
   
      //  System.out.println("Hello World");
}
}
