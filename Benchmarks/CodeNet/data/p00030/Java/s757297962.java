import java.util.Scanner;

public class Main {
	static int count;
	static int n;
	static int m;
	static int t[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			count=0;
			n=sc.nextInt();
			m=sc.nextInt();
			if(n==0 && m==0) break;
			t=new int[10];
			sum(0,0,0);
			System.out.println(count);
		}
	}
	public static void sum(int i,int k,int s){
		if(m<s) return;
		if(i==9){
			if(k==n && s==m){
				count++;
				//			for(int j=0;j<k;j++){
				//				System.out.print(" "+t[j]);
				//			}
				//			System.out.println();
				return;
			}
			return;
		}
		sum(i+1,k,s);
		t[k]=i;
		sum(i+1,k+1,s+i);
	}
}