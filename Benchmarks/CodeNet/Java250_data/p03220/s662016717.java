import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int h[] = new int[n];
		for(int i= 0;i<h.length;i++){
			h[i] = sc.nextInt();
		}
		double tmp[] = new double[n];
		double tm=1000;
		int number=-1;
		for(int i=0;i<tmp.length;i++){
			tmp[i]=(double)t-(double)h[i]*0.006;
			if(tm>Math.abs(tmp[i]-a)){
				tm=Math.abs(tmp[i]-a);
				number = i;	
			}
		}
		number += 1;
		System.out.println(number);
	}
}
