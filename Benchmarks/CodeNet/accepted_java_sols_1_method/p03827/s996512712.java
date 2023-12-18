import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int x = 0;
		int xmax = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'I') {
				x++;
			} else {
				x--;
			}
			if(x > xmax) {
				xmax = x;
			}
		}
		System.out.println(xmax);

	}

}
