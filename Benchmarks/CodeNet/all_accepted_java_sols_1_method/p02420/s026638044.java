import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String cards = sc.next();
		int h,m;
		while(!cards.equals("-")){
			m = sc.nextInt();
			for(int i = 0; i < m; i++){
				h = sc.nextInt();
				cards = cards.substring(h,cards.length()) + cards.substring(0,h);
			}
			System.out.println(cards);
			cards = sc.next();
		}
	}
}