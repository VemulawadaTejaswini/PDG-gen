import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

			for(int i=1;;i++){
				int n = scan.nextInt();
				if(n != 0)
					System.out.println("Case " + i + ": " + n);
				else if(n == 0){
					scan.close();
					break;
				}
			}
	}
}