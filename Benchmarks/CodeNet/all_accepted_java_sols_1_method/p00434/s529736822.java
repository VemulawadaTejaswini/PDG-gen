import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[28];
		int[] check = new int[30];
		
		for(int i = 0; i < 28; i++){
			a[i] = stdIn.nextInt();
			check[a[i]-1] = 1;
		}
		
		for(int i = 0; i < 30; i++){
			if( check[i] == 0 ){
				System.out.println(i+1);
			}
		}
	}
}