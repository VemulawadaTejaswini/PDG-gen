import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b, r, g, c, s, t;
		int ans;
		
		while(true){
			b = scan.nextInt();
			r = scan.nextInt();
			g = scan.nextInt();
			c = scan.nextInt();
			s = scan.nextInt();
			t = scan.nextInt();
			
			if(b == 0 && r == 0 && g == 0 &&
			c == 0 && s == 0 && t == 0)break;
			
			ans = (100 + b*15*6 + r*15*4 + g*7 + c*2)
					-((t-s)*3 - (b*5 + r*3)) ;
			
			System.out.println(ans);
		}
	}
}