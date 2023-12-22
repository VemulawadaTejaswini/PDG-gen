import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		int d = scan.nextInt();
		int count = 0;
		
		for(int i=l;i<=r;i++) {
			if(i % d == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}