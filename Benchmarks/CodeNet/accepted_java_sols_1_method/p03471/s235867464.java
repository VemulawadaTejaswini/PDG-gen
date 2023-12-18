import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    for(int i = 0; i <= n; i++){
      for(int j = 0; j + i <= n; j++){
        int tmp = (y - 10000 * i - 5000 * j) / 1000;
        if(i + j + tmp == n){
          System.out.println(i + " " + j + " " + tmp);
          System.exit(0);
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}