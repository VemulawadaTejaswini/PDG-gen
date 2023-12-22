import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int H[]=new int[N];
		for(int i=0;i<N;i++) {
			H[i]=sc.nextInt();
		}
		sc.close();
		boolean signal=true;
		for(int j=(N-1);j>0;j--) {
			if(H[j]==H[j-1]-1) {
				H[j-1]-=1;
			}else if(H[j]<H[j-1]-1) {
				signal=false;
				break;
			}
		}
		if(signal) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}