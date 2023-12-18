import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(sc.hasNextLine()){
			String str = sc.next();
			StringBuffer s = new StringBuffer(str);
			s = s.reverse();
			if(s.toString().equals(str)) count++;
		}
		System.out.println(count);
	}
}

