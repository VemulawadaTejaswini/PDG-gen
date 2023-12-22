import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tako = scan.nextInt();
		int[] oisi = new int[tako];
		int sum = 0;

		for(int i=0;i<tako;i++) {
			oisi[i] = scan.nextInt();
		}

		for(int a=0;a<tako;a++) {
			for(int b=a+1;b<tako;b++) {
				sum += oisi[a]*oisi[b];
			}
		}

		System.out.println(sum);

		scan.close();
	}

}
