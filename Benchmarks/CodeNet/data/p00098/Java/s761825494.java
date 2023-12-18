import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0098().doIt();
	}
	class aoj0098{
		void roop(int xs,int xe,int ys,int ye,int a[][],int max){
			int xssum = 0;
			int xesum = 0;
			int yssum = 0;
			int yesum = 0;
			int sum = 0;
			//System.out.println(xs+":"+xe+":"+ys+":"+ye);
			if(xe - xs == -1 || ye -ys == -1){
				System.out.println(max);
				System.exit(0);
			}
			for(int i = ys;i < ye+1;i++){
				for(int j = xs;j < xe+1;j++){
					sum = sum + a[i][j];
					if(i == ys)yssum = yssum + a[i][j];
					if(i == ye)yesum = yesum + a[i][j];
					if(j == xs)xssum = xssum + a[i][j];
					if(j == xe)xesum = xesum + a[i][j];
				}
			}
			//System.out.println("????¨?:"+xssum+":"+xesum+":"+yssum+":"+yesum);
			if(max < sum)max = sum;
			if(xssum <= xesum && xssum <= yssum && xssum <= yesum)roop(xs+1,xe,ys,ye,a,max);
			else if(yssum <= xssum && yssum <= xesum && yssum <= yesum)roop(xs,xe,ys+1,ye,a,max);
			else if(xesum <= xssum && xesum <= yssum && xesum <= yesum)roop(xs,xe-1,ys,ye,a,max);
			else if(yesum <= xesum && yesum <= yssum && yesum <= xssum)roop(xs,xe,ys,ye-1,a,max);
		}
		void doIt(){
			int n = sc.nextInt();
			int a[][] = new int [n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					a[i][j] = sc.nextInt();
				}
			}
			roop(0,n-1,0,n-1,a,0);
		}
	}
}