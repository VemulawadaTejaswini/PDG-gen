import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int[] n = new int[2];
		for(int i = 0; i < 2; i++){
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			if(x == 0 && y == 0) break;
			if(x > y)
				System.out.println(x +" "+ y);
		}
	}
}