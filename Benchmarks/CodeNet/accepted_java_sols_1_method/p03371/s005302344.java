import java.util.*;
public class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
    int b=sc.nextInt();
    int ab=sc.nextInt();int x=sc.nextInt();
    int y=sc.nextInt();
    int sum=0;
    if(a+b>ab*2){
        int po=Math.min(x,y);
        sum+=po*ab*2;
        x-=po;
        y-=po;
    }
    sum+=(a>ab*2)?x*ab*2:x*a;
    sum+=(b>ab*2)?y*ab*2:y*b;
    System.out.println(sum);
}

}
