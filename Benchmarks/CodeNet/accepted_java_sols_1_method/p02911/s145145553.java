
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //参加者
		int K = sc.nextInt(); //ポイント
		int Q = sc.nextInt(); //クイズの回数
		int A[] =  new int[Q]; //正解者
		for(int i=0;i<Q;i++) {
			A[i] = sc.nextInt();
		}
		
		int points[] = new int[N];
		//初期化
		for (int point :points ) {
			point=0;
		}
		
		//自分以外に、K回正解されるとアウト。
		//したがって正解数Q回ならば、自分の正解数をAとすると、Q-A<Kならいい。つまり、A＞Q-Kなら良い。
		//開始０ポイントで、正解した人は１ポイントとし、
		//終了までにQ-Kポイントよりも獲得（Q-Kはだめ）すると突破に読み換える。
		for(int i=0;i<Q;i++) {
			points[A[i]-1]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int point :points ) {
			if(point>Q-K) {
				sb.append("Yes");
				sb.append(System.getProperty("line.separator"));
			}else {
				sb.append("No");
				sb.append(System.getProperty("line.separator"));
			}
		}
		String ans = sb.toString();
		
		System.out.println(ans);
		

	}
}
