import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i,n = sc.nextInt();
		int array[] = new int[	100];
		for(i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		for(i = i - 1; i >= 0; i--){
			System.out.print(array[i]);
			if(i != 0){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}