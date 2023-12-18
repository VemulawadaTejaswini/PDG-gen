import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		int count = 0;
		boolean even = true;
		for(int i = 0;i < N;i++) {
			n[i] = sc.nextInt();
		}
		while(even) {
			for(int k = 0;k < N;k++) {
				if(n[k] % 2 == 0) {
					n[k] /= 2; 
				}
				else even = false;
			}
			if(even) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
