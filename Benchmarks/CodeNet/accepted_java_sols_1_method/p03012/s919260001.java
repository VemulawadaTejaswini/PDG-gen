import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
      int W[] = new int[N];
      int sum = 0;
      for(int i=0;i<N;i++){
        W[i] = sc.nextInt();
        sum = sum + W[i];
      }
      int sasum = 0;
      int sa =100000000;
      int san = 10000000;
      for(int i=0;i<N&&sa>san;i++){
        sasum = sasum + W[i];
        sa = san;
        san = Math.abs((sum-sasum)-sasum);
      }

      System.out.println(sa);
    }
}