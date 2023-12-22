import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		boolean[] isAc = new boolean[N];
		for(int i=0;i<N;i++) {
			isAc[i]=false;
		}
		int[] waCount = new int[N];
		for(int i=0;i<N;i++) {
			waCount[i]=0;
		}
		for(int i=0;i<M;i++) {
			int p = sc.nextInt();
			String S = sc.next();
			if(S.equals("AC")) {
				isAc[p-1]=true;
			}else if(!isAc[p-1]) {
				waCount[p-1]+=1;
			}
		}
		int watotal=0;
		int actotal=0;
		for(int i=0;i<N;i++) {
			if(isAc[i]) {
				actotal++;
				watotal+=waCount[i];
			}
		}
		System.out.println(actotal+" "+watotal);
}
}