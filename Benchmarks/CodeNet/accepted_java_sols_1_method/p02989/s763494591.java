import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Integer Array[] = new Integer[N];
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		Arrays.sort(Array);
		if(Array[N/2-1]==Array[N/2]){
			System.out.println(0);
		}else{
			System.out.println(Array[N/2]-Array[N/2-1]);
		}
		sc.close();
	}
};