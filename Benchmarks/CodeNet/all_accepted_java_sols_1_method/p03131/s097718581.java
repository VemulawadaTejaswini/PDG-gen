import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a+2>=b){
      System.out.println(k+1);
      return;
    }
    int count = 0;
    long bis = 1l;
    while(a>bis){
      count++;
      bis++;
    }
    while(k-1>count){
      count+=2;
      bis += b-a;
    }

    while(k>count){
      count++;
      bis++;
    }
    System.out.println(bis);
  }
}
