import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = 0;
		N = cin.nextInt();
		
		while(N>0) {
			if(N%10==7) {
				System.out.println("Yes");
				return;
			}
			N/=10;
		}
		System.out.println("No");
	}

}
