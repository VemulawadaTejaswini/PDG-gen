import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int D = scan.nextInt();
		 int N = scan.nextInt();
		 
		 int cnt = 0;
		 int index = 0;
		 
		 while (cnt < N) {
			 index += 1;
			 if (index * Math.pow(100,D) % (Math.pow(100, D + 1)) != 0) {
				 cnt += 1;
			 }
		 }
		 
		 System.out.println((int)(index * Math.pow(100, D)));
		 scan.close();

	}

}
