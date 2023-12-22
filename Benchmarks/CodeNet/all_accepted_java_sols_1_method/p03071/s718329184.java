import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt(), B=sc.nextInt();
    if(A-B>=2){
      System.out.println(A+A-1);
    }else if(B-A>=2){
      System.out.println(B+B-1);
    } else{
      System.out.println(A+B);
    }
  }
}
