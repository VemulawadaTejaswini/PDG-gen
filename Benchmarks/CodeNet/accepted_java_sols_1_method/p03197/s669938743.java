import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean firsr_win = false;
		for(int i=0;i<n;i++) {
			if(in.nextInt()%2==1) {
				firsr_win = true;
			}
		}
		System.out.println(firsr_win?"first":"second");
		in.close();
	}

}
