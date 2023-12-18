import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		int[] a = new int[4];
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'N':
				a[0]++;
				break;
			case 'W':
				a[1]++;
				break;
			case 'S':
				a[2]++;
				break;
			case 'E':
				a[3]++;
				break;
			}
		}
		
		if((a[0] == 0 && a[2] != 0) || (a[1] == 0 && a[3] != 0) || (a[2] == 0 && a[0] != 0) || (a[3] == 0 && a[1] != 0)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		return;
	}
	
}