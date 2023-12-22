import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int W,H,x,y,r;
		Scanner br=new Scanner(System.in);
		W=br.nextInt();
		H=br.nextInt();
		x=br.nextInt();
		y=br.nextInt();
		r=br.nextInt();
		if((r<=x)&&(x<=W-r)&&(r<=y)&&(y<=H-r)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}