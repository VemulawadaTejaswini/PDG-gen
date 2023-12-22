import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int xdif=0;
		int ydif=0;
		int time=0;

		int nyuryoku=sc.nextInt();
		int tmp1t,tmp2t,tmp1x,tmp2x,tmp1y,tmp2y;
		boolean tadori=true;
		tmp2t=0;
		tmp2x=0;
		tmp2y=0;
		for(int i=0; i<nyuryoku; i++) {
			tmp1t=sc.nextInt();
			tmp1x=sc.nextInt();
			tmp1y=sc.nextInt();

			if(i==0) {
				if(tmp1t-tmp1x-tmp1y<0 || (tmp1t-tmp1x-tmp1y)%2==1) {
					tadori=false;
				}
			}
			else if(tadori==true){
				if((tmp1t-tmp2t)-Math.abs(tmp1x-tmp2x)-Math.abs(tmp1y-tmp2y)<0 || ((tmp1t-tmp2t)-Math.abs(tmp1x-tmp2x)-Math.abs(tmp1y-tmp2y))%2==1) {
					tadori=false;
				}
			}
			tmp2t=tmp1t;
			tmp2x=tmp1x;
			tmp2y=tmp1y;
		}

		if(tadori) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}