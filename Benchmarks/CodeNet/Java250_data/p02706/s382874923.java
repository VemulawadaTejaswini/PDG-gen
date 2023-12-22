import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int total = scan.nextInt();
		int count = 0;
		for(int i=0;i<total;i++){
			count+= scan.nextInt();
		}
		days -= count;
		if(days<0)
			System.out.println(-1);
		else
			System.out.println(days);

	}

}
