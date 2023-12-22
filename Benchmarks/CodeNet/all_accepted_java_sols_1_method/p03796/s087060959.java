import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long S =sc.nextLong(), a=1;
    for(int i=1; i<=S; i++){
      a =a * i % 1000000007;
    }
    System.out.println(a);
  }
}