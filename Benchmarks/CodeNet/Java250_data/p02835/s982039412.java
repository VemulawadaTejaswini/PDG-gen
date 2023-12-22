import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cnt=0;
		for(int i=0;i<3;i++) {
			int num=scan.nextInt();
			cnt+=num;
		}
		scan.close();

		if(cnt>=22) System.out.println("bust");
		else  System.out.println("win");

	}

}