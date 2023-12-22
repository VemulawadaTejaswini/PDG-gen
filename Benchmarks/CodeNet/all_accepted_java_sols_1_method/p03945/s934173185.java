import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char[] c = str.toCharArray();

		int count = 0;
		for(int i = 1; i < str.length(); i++){
			if(c[i] != c[i-1]){
				count ++;
			}
		}
		System.out.println(count);
	}
}
