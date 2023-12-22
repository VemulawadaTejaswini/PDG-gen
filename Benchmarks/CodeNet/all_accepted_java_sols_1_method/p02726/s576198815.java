import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int k[] = new int[n+1];
    int normal = 0;
    int special = 0;
    int min = 0;
    for(int i = 1;i<=n-1;i++){
      for(int j = i + 1;j<=n;j++){
        normal = j - i;
        special = Math.abs(x - i) + Math.abs(y - j) + 1;
        if(normal < special){
          min = normal;
        }else{
          min = special;
        }
        k[min]++;
      }
    }
    for(int i = 1;i<n;i++){
      System.out.println(k[i]);
    }
  }
}
