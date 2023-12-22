import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] team=new long[N*3];
		for(int i=0; i<3*N; i++) {
			team[i]=sc.nextLong();
		}
		Arrays.sort(team);
		long res=0;
		for(int i=0; i<N; i++) {
			res+=team[3*N-1-(2*i+1)];
		}
		System.out.println(res);
	}
}