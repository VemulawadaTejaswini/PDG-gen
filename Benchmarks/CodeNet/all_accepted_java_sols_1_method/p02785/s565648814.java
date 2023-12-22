import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long HP[] = new long[N];
		long HPtotal = 0;
		for(int i=0; i<N; i++) {
			HP[i] = sc.nextLong();
		}
		//入力したHPを昇順（小さい順）に並び替える
			Arrays.sort(HP);
		//K回分の必殺技は後ろのHPが高いモンスターに使えばよい
		//→後ろのモンスターは除いて、N-K体のモンスターのHPを合計して表示すればよい
         for(int j=0; j<N-K; j++) {
			HPtotal+=HP[j];
		}
      		System.out.println(HPtotal);
	}		
}