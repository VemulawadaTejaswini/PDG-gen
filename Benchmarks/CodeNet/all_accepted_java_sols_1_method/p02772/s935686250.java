import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int n = sc.nextInt();

		boolean deny = false;

		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a%2==0) {
				if(a%3==0||a%5==0) {
					//nothing
				}else {
					deny = true;
					System.out.println("DENIED");
					break;
				}
			}

		}

		if(!deny) {
			System.out.println("APPROVED");
		}



	}
}
