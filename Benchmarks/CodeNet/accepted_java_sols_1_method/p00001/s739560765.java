import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] x = new int[10];
		for(int i = 0; i < 10; i++){
			x[i] = stdIn.nextInt();
		}

		for(int i = 0; i < 3; i++){
			int temp;
			for(int j = i; j < 10; j++){
				temp = x[i];
				if( x[j] > x[i] ){
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		for(int i = 0; i < 3; i++){
			System.out.println(x[i]);
		}
	}
}