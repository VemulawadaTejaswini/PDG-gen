import java.util.*;

public class Main{
	public static void main(String[] args){
		//new Main().printHelloWorld();
		//System.out.println(new Main().ITP1_1_B(Integer.parseInt(new Scanner(System.in).next())));
		//new Main().ITP1_1_C();
		//new Main().ITP1_1_D();
		//new Main().ITP1_2_A();
		//new Main().ITP1_2_B();
		new Main().ITP1_2_C();
	}

	public void printHelloWorld(){
		System.out.println("Hello World");
	}

	public int ITP1_1_B(int x){
		return x*x*x;
	}

	public void ITP1_1_C(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a*b + " " + 2*(a+b));
	}

	public void ITP1_1_D(){
		int seconds = new Scanner(System.in).nextInt();
		System.out.println(seconds/3600 + ":" + (seconds%3600)/60 + ":" + (seconds%3600)%60);
	}

	public void ITP1_2_A(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println((a==b)?"a == b":(a > b)?"a > b":"a < b");
	}

	public void ITP1_2_B(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println((a < b && b < c)?"Yes":"No");
	}

	public void ITP1_2_C(){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int t=a[i];a[i]=a[j];a[j]=t;
				}
			}
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}