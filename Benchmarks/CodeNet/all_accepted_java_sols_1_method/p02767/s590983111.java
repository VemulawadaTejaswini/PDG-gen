import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    for(int i = 0;i<n;i++){
      x[i] = sc.nextInt();
    }
    int mindis = 200000000;
    int minplace = -1;
    for(int i = 0;i<101;i++){
      int dis = 0;
      for(int j = 0;j<n;j++){
        dis += Math.abs(x[j] - i) * Math.abs(x[j] - i);
      }
      if(dis < mindis){
        mindis = dis;
        minplace = i;
      }
    }
    int ans = 0;
    for(int i = 0;i<n;i++){
      ans += (x[i] - minplace) * (x[i] - minplace);
    }
    System.out.println(ans);
  }
}
