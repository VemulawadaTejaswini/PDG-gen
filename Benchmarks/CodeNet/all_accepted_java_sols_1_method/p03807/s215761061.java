import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int f = 0;
		for (int i = 0; i < n; i++) {
			long a = scanner.nextLong();
			if(a % 2 != 0){
				f++;
			}
		}
		if(f % 2 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}