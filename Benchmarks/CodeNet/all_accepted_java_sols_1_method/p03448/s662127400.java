import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int count = 0;
    for(int i = 0; i <= a; i++){
      for(int j = 0; j <= b; j++){
        int k = (x - 500 * i - 100 * j) / 50;
        if(k <= c && k >= 0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}