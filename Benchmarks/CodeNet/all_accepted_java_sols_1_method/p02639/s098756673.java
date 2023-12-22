import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5;i++) {
			if(Integer.parseInt(sc.next()) == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
