import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int [] list = new int [N];
		
		for (int index=0; index<N; index++){
		    list[index]= sc.nextInt();
		}
		
		Arrays.sort(list);
		
		int dif = list [N/2] - list [N/2-1];
		
		System.out.println(dif);

		sc.close();
	}
}