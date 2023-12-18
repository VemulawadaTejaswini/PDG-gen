import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < n; i++){
      int count = 0;
      int num = sc.nextInt();
      while(num % 2 == 0){
        count++;
        num /= 2;
      }
      min = min < count ? min : count;
    }
    System.out.println(min);
  }
}