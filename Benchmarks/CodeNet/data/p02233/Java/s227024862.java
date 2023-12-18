import java.util.Scanner;



public class Main {
	public static int fib(int n){
	int a[]=new int[n+1];
    a[0]=1;
	a[1]=1;
	if(n<2){
		return a[n];
	}
	for(int i=2;i<=n;i++){
		a[i]=a[i-1]+a[i-2];
	}
			return a[n];
	}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.next());
	
	System.out.println(fib(n));
		
		

  }
}