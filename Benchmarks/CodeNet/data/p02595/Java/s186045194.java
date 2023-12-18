import java.util.*;
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int res=0;
    while(n-->0) {
    int x = sc.nextInt();
    int y = sc.nextInt();
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
