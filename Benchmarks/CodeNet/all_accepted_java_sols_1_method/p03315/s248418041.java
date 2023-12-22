import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		int insideHead = 0;
		for(int i = 0;i < inputLine.length();++i)
			if(inputLine.charAt(i) == '+')
				++insideHead;
			else if(inputLine.charAt(i) == '-')
				--insideHead;
		System.out.println(insideHead);
      sc.close();
	}
}
