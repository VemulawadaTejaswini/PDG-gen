import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    int cnt = 0;
    for(int i = 0;i < n;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(h<=a&&w<=b)cnt++;
    }
    System.out.println(cnt);
  }
}