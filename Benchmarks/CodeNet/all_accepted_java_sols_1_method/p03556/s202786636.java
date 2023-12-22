import java.util.*;

public class Main{
  public static void main(String args[]){
    int i = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(i*i <= n){
      i++;
    }
    System.out.println((i-1)*(i-1));
  }
}