import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(char c : sc.next().toCharArray()){
			System.out.print((c - 3) < 'A' ? (char)('Z' - ('A' - (c - 3) - 1)) : (char)(c - 3));
		}
		System.out.println();
	}
}