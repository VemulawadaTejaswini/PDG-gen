import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];

		for(int i = 0 ; i < n ; i++ ){
			array[i] = in.nextInt();
		}

		for(int j = n-1 ; j >= 0;j--){
			if(j < 0 || j != n -1){
				System.out.print(" ");
			}
			System.out.print(array[j]);
		}
		System.out.println();
		in.close();

	}

}