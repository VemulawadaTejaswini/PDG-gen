import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] s = new int[999];
		int count = 0;
		for (int i=0; i<999; i++) {
			count =+ count+i+1;
			s[i] = count;
		}
		for (int i=1; i<998; i++) {
			if ( A-s[i] == B-s[i+1] ) {
				System.out.println(s[i]-A);
				return;
			}
		}
	}		
}
