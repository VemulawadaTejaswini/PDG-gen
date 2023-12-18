import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < k; i++){
			int d = sc.nextInt();
			for(int j = 0; j < d; j++){
				a[sc.nextInt()-1] += 1;
			}
		}
		int num = 0;
		for(int e : a){
			if(e == 0)num += 1;
		}
		System.out.println(num);
	}
	
}