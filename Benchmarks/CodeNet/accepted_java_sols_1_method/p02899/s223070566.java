import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      
      int a[] =new int[N+1];
      
      for(int i=1; i<=N; i++){//出席番号をまわす
        int b =sc.nextInt();//出席番号iの生徒が登校してきた,i=2番の生徒が1番目に,i=3番の生徒が2番目に...
        a[b] = i;//出席番号1の生徒は何番目に登校してきた？→3番目,出席番号2の生徒→1番目...
      }
      for(int i=1; i<=N; i++){
      System.out.print(a[i]+" ");//出席番号1の生徒から順番に登校した順番を並べていく
      }
    }
}