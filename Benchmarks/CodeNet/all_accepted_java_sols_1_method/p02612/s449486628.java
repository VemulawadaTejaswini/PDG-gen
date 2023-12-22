import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n%= 1000;
		int change = -1;
		if(n !=0 ) {
			change = 1000 - n;
		} else {
			change = 0;
		}
		System.out.println(change);
	}

}
