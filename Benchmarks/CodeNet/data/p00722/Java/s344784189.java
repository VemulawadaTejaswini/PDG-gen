import java.util.Scanner;
public class Main {
	
	static boolean sosuu(int s) {
		if(s == 1) return false;
		for(int i=2; i<=s; i++) {
			if(s%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int a = sc.nextInt();
				int d = sc.nextInt();
				int n = sc.nextInt();
				if(a+d+n == 0) break;
				
				int sum = a;
				if(sosuu(a)) n--;
				if(n != 0) {
					for(int i=0; ; i++) {
						sum =+ d;
						if(sosuu(sum)) n--;
						if(n == 0) {
							break;
						}
					}
				}
				System.out.println(sum);
			}
		}
	}
}

