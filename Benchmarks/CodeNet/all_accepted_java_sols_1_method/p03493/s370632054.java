import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] s = stdIn.next().toCharArray();
		
		int sum = 0;
		for(char a: s) {
			if(a == '1') {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
