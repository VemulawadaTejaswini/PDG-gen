import java.util.Scanner;
public class Main {
	public static final int limit = 9;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			int m=s.nextInt();
			if(n==0&&m==0)break;
			System.out.println(s(n,m,0));
		}

	}
	public static int s(int n,int m,int x){
		if(n==1){
			return x<=m&&m<=limit?1:0;
		}
		int a=0;
		for(int i=x;i<=limit;i++){
			a+=s(n-1,m-i,i+1);
		}
		return a;
	}
}