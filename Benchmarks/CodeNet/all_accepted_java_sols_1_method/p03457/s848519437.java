import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean travelable = true;
		for(int i=0;i<n;i++) {
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if(x+y>t || (x+y-t)%2!=0) {
				travelable = false;
				break;
			}
		}
		if(travelable) System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}

}
