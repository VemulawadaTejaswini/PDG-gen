import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		int W;
		int H;
		int x;
		int y;
		int r;
		
		boolean leftside = false;
		boolean rightside = false;
		boolean upside = false;
		boolean downside = false;

		Scanner scan = new Scanner(System.in);
		W = Integer.parseInt(scan.next());
		H = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());
		y = Integer.parseInt(scan.next());
		r = Integer.parseInt(scan.next());
		
		
		
		if((x-r)<0){
			leftside=true;
		}
		
		if(W<(x+r)){
			rightside=true;
		}
		
		if(H<(y+r)){
			upside=true;
		}
		
		if((y-r)<0){
			downside=true;
		}

		if(leftside||rightside||upside||downside){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		
	}
}