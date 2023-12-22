import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] ac = a.toCharArray();
		int count = 0;
		if (ac[0] == '1') count++;
		if (ac[1] == '1') count++;
		if (ac[2] == '1') count++;
		System.out.println(count);
	}	
}