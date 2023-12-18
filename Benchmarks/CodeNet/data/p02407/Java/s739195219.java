import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		int[] rever = new int[size];
		
		for(int i=0; i<array.length; i++){
			array[i] = scanner.nextInt();
			rever[size-i-1] = array[i];
		}
		for(int i=0; i<array.length; i++){
			System.out.print(rever[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}