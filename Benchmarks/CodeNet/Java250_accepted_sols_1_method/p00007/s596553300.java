import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int debt = 100000;
		for(int i=0;i<n;i++) {
			debt += debt/20;
			debt = ((debt-1)/1000+1)*1000;
		}
		System.out.println(debt);
	}

}