
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(m<n*2||m>n*4||m%2==1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}





	}

}