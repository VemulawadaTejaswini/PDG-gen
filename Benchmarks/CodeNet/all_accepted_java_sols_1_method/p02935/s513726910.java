import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int []v = new int[N];
		
		for(int i=0; i<N; i++) {
			v[i] = sc.nextInt();
		}
      	//vを昇順に並び替える
		Arrays.sort(v);
        //answerにvの最小値を入れる
		double answer = v[0];
      
   		//小さい順から計算すれば最大値が得られる
		//最小値＋次の値/2をanswerに代入していく
		for(int j=1; j<N; j++) {
			answer = (answer+v[j])/2;
		}
		System.out.println(answer);
	}		
}