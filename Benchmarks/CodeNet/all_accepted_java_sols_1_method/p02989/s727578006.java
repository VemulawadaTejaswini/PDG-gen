import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String inputN = scanner.nextLine();
		
		String inputP = scanner.nextLine();
		String[] pStr = inputP.split(" ", 0);
		
		int n = Integer.parseInt(inputN);
		int pInt[] = new int[n];
		for(int i=0;i<n;i++){
			pInt[i] = Integer.parseInt(pStr[i]);
		}
		
		Arrays.sort(pInt);
		
		System.out.println(pInt[n/2] - pInt[n/2-1]);
	}
}