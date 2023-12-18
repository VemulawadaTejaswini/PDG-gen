import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		//白色区域的横坐标与纵坐标和黑点的个数
		int W=sc.nextInt();
		int H=sc.nextInt();
		int N=sc.nextInt();
		int S=H,Y=W,X=0,Z=0,mianji;//分别为白色区域的上下左右
		int x,y,T;//点的横坐标和纵坐标
		//输入点的横坐标和纵坐标和操作指令
		for(int i=0;i<N;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			T=sc.nextInt();
			if(T==1&&x>Z) {//1位取白色区域左边，如果x比Z大，Z赋值x
				Z=x;
			}
			if(T==2&&x<Y) {
				Y=x;
			}
			if(T==3&&y>X) {
				X=y;
			}
			if(T==4&&y<S) {
				S=y;
			}
		}
		if((Y-Z)>0&&(S-X)>0){
			mianji=(Y-Z)*(S-X);
			System.out.println(mianji);
		}else {
			System.out.println("0");
		}
        }
}