import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//String N = in.nextLine();
		int N = in.nextInt();
		long L0 = 2;
		long L1 = 1;
		if(N==1) {
			System.out.println(L1);
			System.exit(0);
		}
		int i=1;
		long L=1;
		while(i<N) {
			L = L1 + L0;
			L0 = L1;
			L1 = L;
			i++;
		}
		System.out.println(L);
		
		
		in.close();
	}
}
