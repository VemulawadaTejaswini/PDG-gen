import java.util.Scanner;
public class polygons {
	public static void main(String args[]){
		int n;
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		while (true){
			n=sc.nextInt();
			if (n==0) break;
			double s=0.0;
			int [][] ver=new int[n][2];
			for (int i=0;i<n;i++){
				ver[i][0]=sc.nextInt();
				ver[i][1]=sc.nextInt();
				if(i>1){
					s+=cal(ver[i],ver[i-1],ver[0]);
				}
			}
			cnt++;
			System.out.println(cnt+" "+Math.abs(s/2));
		}
	}
	private static double cal(int [] a,int [] b,int [] o){
		a[0]=a[0]-o[0];
		a[1]=a[1]-o[1];
		b[0]=b[0]-o[0];
		b[1]=b[1]-o[1];
		return(a[0]*b[1]-a[1]*b[0]);
	}
}