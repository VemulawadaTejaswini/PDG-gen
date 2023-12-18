import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] input=new Scanner(System.in).nextLine().toCharArray();
		String result="Yes";
		for(int i=0;i<input.length;i++) {
			if((input[i]=='R'&&i%2==1)||(input[i]=='L'&&i%2==0)) {
				result="No";
				break;
			}
		}
		System.out.println(result);
	}
}