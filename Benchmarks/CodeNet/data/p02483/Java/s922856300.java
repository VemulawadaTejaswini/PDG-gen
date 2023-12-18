import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] x;
		int[] ar = new int[3];
		String ope;
		Scanner sc = new Scanner(System.in);

		for(int i = 0;i < 3;i++){
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		System.out.println(ar[0]+ " " + ar[1]+ " " + ar[2]);
	}
}