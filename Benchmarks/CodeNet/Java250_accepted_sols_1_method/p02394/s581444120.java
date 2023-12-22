import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int W,H,x,y,r;
		
		W=scan.nextInt();
		H=scan.nextInt();
		x=scan.nextInt();
		y=scan.nextInt();
		r=scan.nextInt();
		
		if(r<=x&&r<=y&&x<=W-r&&y<=H-r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		scan.close();
	}
}