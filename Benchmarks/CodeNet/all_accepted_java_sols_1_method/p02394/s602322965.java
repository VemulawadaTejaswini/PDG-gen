import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//指定した範囲内に円があるかどうかを判定する
		//指定した範囲：座標(0,0)から(W,H)
		//円：中心点(x,y)、半径r
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(r<=x && x<=W-r && r<=y && y<=H-r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

