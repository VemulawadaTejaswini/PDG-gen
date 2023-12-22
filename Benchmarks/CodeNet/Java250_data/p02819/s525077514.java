import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean judge = true;

		while(judge ) {
			judge = false;
			for(int i = 2; i < x; i++) {
				if(x%i==0) {
					judge = true;
					x++;
					break;
				}
			}
		}
		System.out.println(x);
	}

}