import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[100002];
    String[] S = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      num[n]++;
      num[n+1]++;
      num[n+2]++;
    }
    
    int ans = 0;
    for(int i = 0; i < 100002; i++){
      ans = num[i] > ans ? num[i] : ans;
    }
    System.out.println(ans);
  }
}