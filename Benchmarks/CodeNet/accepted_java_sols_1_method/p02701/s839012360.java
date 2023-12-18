import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			s[i] = scan.next();
		}
		
		Arrays.sort(s);
		
		for(int i=0;i<n-1;i++) {
			if(i == 0) {
				count++;
			}
			if(!(s[i].equals(s[i+1]))) {
				count++;
			}
		}
		if(count == 0) {
			count++;
		}
		System.out.println(count);

	}

}