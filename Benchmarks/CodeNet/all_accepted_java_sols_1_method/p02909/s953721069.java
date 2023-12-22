import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String s_check[] = {"Sunny","Cloudy","Rainy"};
		for(int i=0;i<s_check.length;i++) {
			if(s_check[i].equals(s)) {
				if(i==s_check.length-1)System.out.println(s_check[0]);
				else System.out.println(s_check[i+1]);
			}
		}
	}

}