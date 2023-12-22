import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n+1];
		array[0] = 1;
		array[1] = 1;
		for(int i=0 ; i<(n-1) ; i++) {
			array[i+2] = array[i+1] + array[i];
		}
		System.out.println(array[n]);
	}

}