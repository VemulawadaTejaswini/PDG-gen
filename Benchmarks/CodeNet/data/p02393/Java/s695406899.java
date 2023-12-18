import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		int[] a = new int[3];
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i=0; i<3; i++){
			System.out.println(a[i]);
		}
		
		in.close();
	}
}