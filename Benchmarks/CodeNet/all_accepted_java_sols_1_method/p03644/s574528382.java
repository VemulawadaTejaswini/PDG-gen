import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] w = {1,2,4,8,16,32,64}; 
out:		for(int i = N; i > 0; i--) {
			for(int j = w.length - 1; j >= 0; j--) {
				if(i == w[j]) {
					System.out.println(w[j]);
					break out;
				}
			}
		}
	}
}