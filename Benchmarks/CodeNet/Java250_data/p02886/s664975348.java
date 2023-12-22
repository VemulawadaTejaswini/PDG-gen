import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int amount = 0;
		int kaihuku = 0;
		Integer Array[] = new Integer[N];

		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
			if(i!=0){
				for(int j = 0; j < i; j ++){
					kaihuku =  Array[i]*Array[j];
					amount += kaihuku;
				}
			}
		}
		System.out.println(amount);
		sc.close();
	}
};