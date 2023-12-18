import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static int hills[] = new int[10];
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			hills[i] = scan.nextInt();
		}
		Arrays.sort(hills);
		
		System.out.println(hills[9]);
		System.out.println(hills[8]);
		System.out.println(hills[7]);
	}
}