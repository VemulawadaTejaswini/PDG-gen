import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] A = new Integer[3];
		A[0] = new Integer(sc.nextInt());
		A[1]= new Integer(sc.nextInt());
		A[2]= new Integer(sc.nextInt());
		Arrays.sort(A);
		
		System.out.println((A[1]-A[0])+(A[2]-A[1]));
	}
}
