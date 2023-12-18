import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number = sc.nextInt();
	public static void main (String[] args) {
		Main MMS = new Main(); 
		System.out.println(MMS.min(number-1)+" "+MMS.max(number-1)+" "+MMS.sum(number-1));
	}	
	int a[]=new int[number];
	int b=0;
	public int min(int n){ 
		b = sc.nextInt();
		a[n]=b;
		if (n==0) {return b;}
		else return Math.min(b, min(n-1));
	}
	public int max(int n){
		a[n] = sc.nextInt();
		if (n==0) {return a[0];}
		else return Math.max(a[n], max(n-1));
	}
	public long sum(int n){ 
		a[n] = sc.nextInt();
		if (n==0) {return a[0];}
		else return a[n]+sum(n-1);
	}
}