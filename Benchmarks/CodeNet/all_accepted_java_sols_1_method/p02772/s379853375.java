import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num;
		boolean ap = true;
		while(sc.hasNext()) {
			num = sc.nextInt();
			if(num%2!=0) continue;
			if(num%3!=0 && num%5!=0) {
				System.out.println("DENIED");
				ap = false;
				break;
			}
		}
		if(ap) System.out.println("APPROVED");
	}

}
