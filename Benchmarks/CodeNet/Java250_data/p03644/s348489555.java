import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num == 1) {
			System.out.println(num);
			return;
		}
		int most = 0;
		for(int ind = 1; ind<=num;ind++) {
			if(isRoot2(ind)) most = ind;
		}
		System.out.println(most);
	}
	
	private static boolean isRoot2(int num) {
		for(int ind = 1;ind<=10;ind++) {
			if(num == (Math.pow(2, ind))) return true;
		}
		return false;
	}
}
