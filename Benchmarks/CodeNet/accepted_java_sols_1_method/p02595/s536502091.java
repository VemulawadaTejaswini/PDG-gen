import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),d=sc.nextInt(),f=0;
    for(int i=0;i<n;i++){
      long x=sc.nextInt(),y=sc.nextInt();
        if(d>=Math.sqrt(x*x+y*y)) f++;
    }
    System.out.println(f);
  }
}