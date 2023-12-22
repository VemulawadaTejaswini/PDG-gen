import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		int W,H,x,y,r;
		Scanner scan = new Scanner(System.in);
		W = Integer.parseInt(scan.next());
		H = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());
		y = Integer.parseInt(scan.next());
		r = Integer.parseInt(scan.next());
		
		if((x<r)||(y<r)){
			System.out.println("No");
		}else if((W>=x+r)&&(H>=y+r)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}