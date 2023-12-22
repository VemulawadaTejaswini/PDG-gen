import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String right = "CODEFESTIVAL2016";
		String input = in.next();
		int count = 0;
		for(int i=0;i<right.length();i++){
			char chtemp = input.charAt(i);
			char chright = right.charAt(i);
			if(chtemp != chright)
				count++;
		}
		System.out.println(count);

	}

}