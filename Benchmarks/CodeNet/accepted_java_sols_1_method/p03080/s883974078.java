import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		int red = 0;
		int blue = 0;
		
		String[] ss = s.split("");
		
		for(int i=0; i<n; i++) {
			if(ss[i].equals("R")) {
				red++;
			}else {
				blue++;
			}
		}
		
		if(red>blue) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
