import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = N % 2;
    if(a == 1){
      System.out.println(((N / 2) + 1));
    }else{
      System.out.println((N / 2));
    }
  }
}