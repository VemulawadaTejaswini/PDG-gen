import java.util.Arrays;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] str = scan.next().toCharArray();
		for(int i=str.length; i<=0; i--){
			System.out.println(str[i]);
		}
	}
} 