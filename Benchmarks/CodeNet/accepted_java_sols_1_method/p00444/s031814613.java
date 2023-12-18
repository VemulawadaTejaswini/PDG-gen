import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] result = new int[100];
		int[] coin = new int[6];
		coin[0] = 500;
		coin[1] = 100;
		coin[2] = 50;
		coin[3] = 10;
		coin[4] = 5;
		coin[5] = 1;
		int index = 0;
		while( n != 0 ){
			int x = 1000-n;
			int sum = 0;
			for(int i = 0; i < 6; i++){
				sum += x/coin[i];
				x %= coin[i];
			}
			result[index] = sum;
			index++;
			n = stdIn.nextInt();
			
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}