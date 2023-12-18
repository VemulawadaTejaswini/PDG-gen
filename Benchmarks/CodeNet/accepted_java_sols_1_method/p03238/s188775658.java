import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int nenrei = stdIn.nextInt();
		int a;
		int b;
					
		if (nenrei == 1){
			System.out.println("Hello World");
		}
		if(nenrei == 2) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			System.out.println((a + b));
		}	
	}
}