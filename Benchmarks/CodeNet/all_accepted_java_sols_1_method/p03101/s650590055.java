import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int menseki = H*W;
		int hles = W; //wlesされるたびに1減る
		int wles = H; //hlesされるたびに1減る
		
		for(int i=0; i<h; i++ ) {
			menseki = menseki -hles;
			wles--;
		}
		for(int i=0; i<w; i++) {
			menseki = menseki-wles;
			hles--;
		}
		System.out.println(menseki);
		
		
	}}