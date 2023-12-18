
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String cards = sc.next();
		while(! cards.equals("-")){
			int n = sc.nextInt();
			for(int i=0; i< n; i++){
				int h = sc.nextInt();
				String r = cards.substring(0, h);
				String l = cards.substring(h);
				cards = l + r;
			}
			System.out.println(cards);
			cards = sc.next();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}