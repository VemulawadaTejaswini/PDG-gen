import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next(), s2 = scanner.next();
		StringBuffer sb = new StringBuffer(s2);
        String s3 = sb.reverse().toString();
		if(s1.equals(s3)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
