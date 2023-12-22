import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s =scan.nextInt();
		int h = s/3600;
		int m = (s%3600)/60;
		s=(s%3600)%60;
		System.out.println(h+":"+m+":"+s);
        scan.close();
	}

}
