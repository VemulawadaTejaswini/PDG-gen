import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = "CODEFESTIVAL2016";
		String str2 = scanner.next();
		int count = 0;
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i))
				++count;
		}
		System.out.println(count);
		scanner.close();
	}

}
