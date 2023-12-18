import java.util.Scanner;



public class Main {

public static int fib(int n){
	int fib[]=new int[50];
	fib[0]=1;
	fib[1]=1;
	
	for(int i=0;i<=n-2;i++){
		fib[i+2]=fib[i]+fib[i+1];
	}
		
	return fib[n];
}

  public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	
	
	int ans,n=Integer.parseInt(sc.next());
	
	ans=fib(n);
	System.out.println(ans);
	
	
	 }


}