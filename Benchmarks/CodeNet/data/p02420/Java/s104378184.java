import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String cards = s.next();
		int num = s.nextInt();
		while(!"-".equals(cards)){
			for(int i = 0;i < num;i++){
				int h = s.nextInt();
				String top = cards.substring(0,cards.length()-h);
				String under = cards.substring(cards.length()-h, cards.length());
				cards = under + top;
			}
			System.out.println(cards);
			cards = s.next();
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}