import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		int count = 0;

		for(int i=1;i<=seisu;i++) {
			String mozi = String.valueOf(i);
			if(mozi.length()%2 == 1) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
