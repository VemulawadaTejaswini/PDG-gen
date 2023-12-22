import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=2*sc.nextInt()+1;
    System.out.println((n+m-1)/m);
  }
}