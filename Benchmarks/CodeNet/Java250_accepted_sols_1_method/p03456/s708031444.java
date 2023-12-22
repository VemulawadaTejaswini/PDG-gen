import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		scan.close();

		String s=String.valueOf(a)+String.valueOf(b);
		int num=Integer.valueOf(s);
		int check=0;
		for(int i=1;i<=num;i++) {
			if(i*i==num) {
				check=1;
				break;
			}
		}
		System.out.println((check==1)? "Yes":"No");
	}

}