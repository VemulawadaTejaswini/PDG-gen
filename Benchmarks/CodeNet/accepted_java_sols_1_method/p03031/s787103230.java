import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int M = sc.nextInt();
	  int[] k = new int[M];
	  int[][] s = new int[M][N];
	  for(int i = 0; i<M; i++) {
		  k[i] = sc.nextInt();
		  for(int j=0; j<k[i]; j++) {
			  s[i][j] = sc.nextInt();
		  }
	  }
	  int[] p = new int[M];
	  for(int i=0; i<M; i++) {
		  p[i] = sc.nextInt();
	  }
	  int count = 0;
	  int button = 1;
	  for(int i=0; i<N; i++) {
		  button *=2;
	  }
	  
	  boolean isTrue = true;
	  //ビット全探索。最大1024回
	  for(int bit=0; bit<button; bit++) {
		  isTrue = true;
		  //全ての電球が条件を満たすかチェック。満たさなければアウト
		  for(int i=0; i<M; i++) {
			  //電球に繋がれてるスイッチをチェック
			  int on = 0;//オンになってるスイッチの数
			  //対象のスイッチがオンになってるか判定
			  for(int j=0; j<k[i];j++) {
				  int n = s[i][j] - 1;
				  if ((bit & (1 <<n)) != 0) {
					  on++;
				  }
			  }
			  if(on%2 != p[i]) {
				  isTrue = false;
				  break;
			  }
			  }	  
		  if(isTrue)
			  count++;
	  }
	  out.println(count);
	  }
  }	