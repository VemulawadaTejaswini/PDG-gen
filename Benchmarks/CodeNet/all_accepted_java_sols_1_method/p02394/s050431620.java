import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int W,H,x,y,r;
		Scanner sc=new Scanner(System.in);
		W=sc.nextInt();
		H=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		r=sc.nextInt();
		if(x<r || y<r){
			System.out.println("No");
		}else if((x+r)>W || (y+r)>H){
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
    }
}
