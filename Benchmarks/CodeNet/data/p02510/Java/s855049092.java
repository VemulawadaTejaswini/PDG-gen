import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String cards = stdIn.next();
			if(cards.equals("-")) break;
			int m = stdIn.nextInt();
			for(int i=0;i<m;i++){
				int h = stdIn.nextInt();
				String temp = cards.substring(0,h);
				cards = cards.concat(temp);
				cards = cards.substring(h);
			}
			System.out.println(cards);
		}
	}
}