import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int k=s.nextInt(),a=s.nextInt(),b=s.nextInt();
    int c=Math.max(0,k-a+1);
    System.out.print(Math.max((long)(b-a)*(c/2)+a+c%2,(long)k+1));
  }
}