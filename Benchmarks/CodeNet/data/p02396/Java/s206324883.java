import java.util.Scanner;

class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x;
		while(true){
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			int i = 1;
			if(x == 0)break;
			System.out.println("Case " + i + ":" + x);
		}
	}
}