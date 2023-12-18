import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),r=sc.nextInt(),minv=r,maxv=Integer.MIN_VALUE;
		for(int i=1;i<n;++i) {
			r=sc.nextInt();
			maxv=Math.max(maxv, r-minv);
			minv=Math.min(minv, r);
		}
		sc.close();
		System.out.println(maxv);
	}
}
