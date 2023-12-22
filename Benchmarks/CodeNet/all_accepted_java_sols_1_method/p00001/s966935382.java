import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer M[]= new Integer[10];
		for(int i=0; i<M.length; i++) {
			M[i]=sc.nextInt();
		}
		Arrays.sort(M,Collections.reverseOrder());
		
		for(int i=0; i<3; i++) {
			System.out.println(M[i]);
		}
		
	}

}
