import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = x;
    int f =0;
    while(n>0){
      f += n%10;
      n=n/10;
    }
    if(x%f==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}