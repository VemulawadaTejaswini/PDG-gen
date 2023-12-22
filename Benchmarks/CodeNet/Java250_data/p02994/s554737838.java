import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int N = sc.nextInt();
      	int L = sc.nextInt();
      	int aji[] = new int[N];
      	int sum = 0;
      	int min = L;
		
      	for(int i=1;i<=N;i++){
          aji[i-1] = L + i - 1;
          if(Math.abs(aji[i-1]) < Math.abs(min)){
            min = aji[i-1];
          }
          sum = sum + aji[i-1];
        }
      System.out.println(sum-min);
	}
}