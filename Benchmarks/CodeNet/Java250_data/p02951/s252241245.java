import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max= sc.nextInt();
		int current=sc.nextInt();
		int c=sc.nextInt();
		if(c-(max-current)<0){
			System.out.println(0);
		}else {
		System.out.println(c-(max-current));
		}
	}
}
