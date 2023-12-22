import java.util.Scanner;

 class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int x;
		while(true){
			x = scan.nextInt();
			if(x == 0)break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}