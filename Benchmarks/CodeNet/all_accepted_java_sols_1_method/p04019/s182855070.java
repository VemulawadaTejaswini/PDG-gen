import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[4];
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'S') a[0]++;
			else if(s.charAt(i) == 'N') a[1]++;
			else if(s.charAt(i) == 'W') a[2]++;
			else a[3]++;
		}
		if((a[0] >= 1 && a[1] >= 1 || a[0] == 0 && a[1] == 0) && (a[2] >= 1 && a[3] >= 1 || a[2] == 0 && a[3] == 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
