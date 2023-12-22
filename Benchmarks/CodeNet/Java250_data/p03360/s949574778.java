import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ary = new int[3];
		
		for ( int i = 0; i < 3; i++ ) {
			ary[i] = in.nextInt();
		}
		in.nextLine();
		int k = in.nextInt();
		
		Arrays.sort(ary);
		
		for ( int i = 1; i <= k; i++ ) {
			ary[2] = ary[2]*2;
		}
		
		int fin = 0;
		for ( int i = 0; i < 3; i++ ) {
			fin += ary[i];
		}
		
		System.out.println(fin);
	}
}