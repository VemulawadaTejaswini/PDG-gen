import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int min = 0;

		for(int i =1;i<=1009;i++) {
			if((int)(i*0.08) == a && (int)(i*0.1) == b) {
				min = i;
				break;
			}else {
				min = -1;
			}
		}

		System.out.println(min);

		scan.close();

	}

}
