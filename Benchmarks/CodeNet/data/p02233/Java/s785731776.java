import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int i=2,a=1,b=1;
		if(n==0){
			System.out.println(1);
			System.exit(0);
		}
		if(n==1){
			System.out.println(1);
			System.exit(0);
		}
		dfs(i,a,b,n);
	}
	public static void dfs(int i,int a,int b,int n){
		if(i==n){
			System.out.println(b+a);
			System.exit(0);
		}
		i++;
		dfs(i,b,a+b,n);
	}
}

