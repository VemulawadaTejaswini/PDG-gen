import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int[] n = new int[5];
		for(int i = 0; i < 5; i++){
			n[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			int max = i;
			for(int j = i+1; j < 5; j++){
				if( n[max] < n[j] ){
					max = j;
				}
			}
			int temp = n[max];
			n[max] = n[i];
			n[i] = temp;
		}
		for(int i = 0; i < 4; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println(n[4]);
	}
}