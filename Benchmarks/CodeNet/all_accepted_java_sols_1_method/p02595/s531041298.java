import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    for(int i=0;i<n;i++){
      double x = sc.nextInt();
      double y = sc.nextInt();
      double dis = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
      if(dis<=d){
        count++;
      }
    }
      System.out.println(count);
  }
}