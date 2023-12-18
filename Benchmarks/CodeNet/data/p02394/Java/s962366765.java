import java.util.Scanner;
public class Main{
	public static void Main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int m = 2*r;
		
		if(x<W && x>0 && y<H && y>0 && m<W && m<H){
			System.out.println("Yes");
		}else if(x>=W && x>0 || y>=H && y>0 && m<W && m<H){
			System.out.println("No");
		}
	}
}