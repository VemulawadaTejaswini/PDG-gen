import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			char[] input = sc.next().toCharArray();
			
			int sum = 0;
			for(char c : input){
				sum += c - '0';
			}
			
			int len = input.length + sum / 10;
			System.out.println(len % 2 == 1 ? "Audrey wins." : "Fabre wins.");
		}
	}

}