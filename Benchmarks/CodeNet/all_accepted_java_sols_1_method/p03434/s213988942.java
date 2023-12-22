import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] Array = new Integer[N];
		for(int i = 0;i < N;i++) {
			Array[i] = sc.nextInt();
		}
		Arrays.sort(Array,Collections.reverseOrder());
		int A = 0,B = 0;
		for(int k = 0;k < N;k++) {
			if(k % 2 == 0) A += Array[k];
			else B += Array[k];
		}
		int ans = A - B;
		System.out.println(ans);
		sc.close();
	}

}
