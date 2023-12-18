import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int aa[][] = new int[10][10];
    int n = sc.nextInt();
	for (int i=1;i<=n;i++){
      int a = i % 10;
      int b = i;

      while (b >= 10) {
        b = b/10;
      }
      aa[b][a]++;
    }    
    int ans = 0;
    for (int i=1;i<=9;i++){
      for (int j=1;j<=9;j++){
        ans += aa[i][j]*aa[j][i];
      }
    }
    System.out.println(ans);
  }
}

