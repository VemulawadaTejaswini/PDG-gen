import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int count=0;
		if(s.substring(0, 1).equals("2"))count++;
		if(s.substring(1, 2).equals("2"))count++;
		if(s.substring(2, 3).equals("2"))count++;
		if(s.substring(3, 4).equals("2"))count++;
		System.out.println(count);
	}
}

