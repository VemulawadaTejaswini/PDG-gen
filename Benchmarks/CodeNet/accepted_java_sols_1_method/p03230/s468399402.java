import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int unko=sc.nextInt();
		boolean ike=false;
		int N=0;
		for(int i=0; i<=500; i++) {
			if(unko==i*(i+1)/2) {
				ike=true;
				N=i;
				break;
			}
			else if(unko<i*(i+1)/2) {
				break;
			}
		}
		if(ike) {
			System.out.println("Yes");
			System.out.println(N+1);
			int[][] ary=new int[N+1][N];
			int[] kaz=new int[N+2];
			for(int i=0; i<=N; i++) {
				for(int j=0; j<N; j++) {
					ary[i][j]=0;
				}
			}
			for(int i=0; i<=N+1; i++) {
				kaz[i]=0;
			}
			int counter=1;
			for(int i=1; i<=N+1; i++) {
				for(int j=1; j<i; j++) {
					ary[i-1][kaz[i-1]]=counter;
					kaz[i-1]++;
					ary[j-1][kaz[j-1]]=counter;
					kaz[j-1]++;
					counter++;
				}
			}
			String buri="";
			for(int i=0; i<N+1; i++) {
				buri=Arrays.toString(ary[i]);
				buri=buri.replaceAll(",","");
				buri=buri.replace("["," ");
				buri=buri.replace("]","");
				System.out.println(N+buri);
			}
		}
		else {
			System.out.println("No");
		}
	}
}