import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		
		while(true) {
			int i = sc.nextInt();
			
			if(i == 0) {
				break;
			}else {
				System.out.println("Case " + a + ": " + i);
				a++;
			}
		}
	}
}

