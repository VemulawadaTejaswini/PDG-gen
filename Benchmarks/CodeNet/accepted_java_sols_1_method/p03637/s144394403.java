import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[3];
		for(int i=0;i<n;i++) {
			int num = in.nextInt();
			if(num%4==0) count[2]++;
			else if(num%2==0) count[1]++;
			else count[0]++;
		}
		if(count[0]<=count[2]) System.out.println("Yes");
		else if(count[0]==count[2]+1 && count[1]==0) System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}

}
