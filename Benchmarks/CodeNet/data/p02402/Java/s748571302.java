import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number = sc.nextInt();
	public static void main (String[] args) {
		Main MMS = new Main(); 
		System.out.println(MMS.min(number-1)+" "+MMS.max(number-1)+" "+MMS.sum(number-1));
	}
	int b[] = new int[number];
	public int min(int n){ 
		int a= sc.nextInt();
		b[n]=a;
		if (n==0) {return b[0];}
		else return Math.min(b[n], min(n-1));
	}
	public int max(int n){ 
		if (n==0) {return b[0];}
		else return Math.max(b[n], max(n-1));
	}
	public long sum(int n){ 
		if (n==0) {return b[0];}
		else return b[n]+sum(n-1);
	}
}