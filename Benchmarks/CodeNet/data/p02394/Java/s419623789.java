import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		if(x<W && x>0 && y<H && y>0 || (x+r)<=W && (x-r)>=0){
			System.out.println("Yes");
		}else if(x>=W && x>0 || y>=H && y>0 || (x+r)>W && (x-r)<0){
			System.out.println("No");
		}
	}
}