import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] a = new double[N];
		for(int i = 0; i < N; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();
			if(b >= 5 && p >= 2)
				a[i] = (x*b + y*p)*0.8;
			else
				a[i] = x*b + y*p;
		}
		for(int i = 0; i < N; i++)
			System.out.println((int)a[i]);
		}
	}