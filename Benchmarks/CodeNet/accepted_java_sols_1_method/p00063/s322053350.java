import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			StringBuffer s = new StringBuffer(str);
			s = s.reverse();
			if(str.equals(s.toString())) count++;
		}
		System.out.println(count);
	}
}

