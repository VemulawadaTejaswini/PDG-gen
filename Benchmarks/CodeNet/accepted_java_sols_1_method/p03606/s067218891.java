import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// GET INPUT
		
		int N = sc.nextInt();
		int[] ninzu = new int[100003];
		for(int i=0; i<N; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ninzu[l]++;
			ninzu[r+1]--;
		}
		
		// GET INPUT END
		
		sc.close();

		for(int i=1; i<100003; i++) {
			ninzu[i] += ninzu[i-1];
		}
		for(int i=1; i<100003; i++) {
			ninzu[i] += ninzu[i-1];
		}
		
		System.out.println(ninzu[100002]);
	}

}