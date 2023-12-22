import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] c=s.toCharArray();
		int cnt=0;
		for(int i=0;i<c.length;i++) {
			if(Character.getNumericValue(c[i])==1)cnt++;
		}
		System.out.println(cnt);

	}

}
