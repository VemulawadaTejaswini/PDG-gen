import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		//new Main().printHelloWorld();
		//System.out.println(new Main().ITP1_1_B(Integer.parseInt(new Scanner(System.in).next())));
		//new Main().ITP1_1_C();
		//new Main().ITP1_1_D();
		//new Main().ITP1_2_A();
		//new Main().ITP1_2_B();
		//new Main().ITP1_2_C();
		//new Main().ITP1_2_D();
		//new Main().ITP1_3_A();
		//new Main().ITP1_3_B();
		//new Main().ITP1_3_C();
		//new Main().ITP1_3_D();
		//new Main().ITP1_4_A();
		new Main().ITP1_4_B();
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

	public void ITP1_2_D(){
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		System.out.println((x+r<=w && x-r>=0 && y+r<=h && y-r>=0)?"Yes":"No");
	}

	public void ITP1_3_A(){
		for(int i=0;i<1000;i++){
			System.out.println("Hello World");
		}
	}

	public void ITP1_3_B(){
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(scan.hasNext()){
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}

	public void ITP1_3_C(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			System.out.println((x < y)?x+" "+y:y+" "+x);
		}
	}

	public void ITP1_3_D(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
			if(c%i==0){
				count++;
			}
		}
		System.out.println(count);
	}

	public void ITP1_4_A(){
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		System.out.printf("%d %d %.5f\n",a/b,a%b,(double)a/b);
	}

	public void ITP1_4_B(){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.printf("%.6f %.6f\n",r*r*Math.PI,r*2*Math.PI);
	}
}