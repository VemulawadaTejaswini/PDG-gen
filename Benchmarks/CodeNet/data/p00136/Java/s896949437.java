import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans[] = new int[6];
		for(int i=0; i<n; i++){
			double d = in.nextDouble();
			ans[(d<165)?0:(d<170)?1:(d<175)?2:(d<180)?3:(d<185)?4:5]++;
		}
		for(int i=0; i<6; i++){
			System.out.print((i+1) + ":");
			for(int j=0; j<ans[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
}