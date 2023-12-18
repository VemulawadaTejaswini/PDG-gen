import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		HashMap<Character, boolean[]> card = new HashMap<Character, boolean[]>();
		card.put('S', new boolean[13]);
		card.put('H', new boolean[13]);
		card.put('C', new boolean[13]);
		card.put('D', new boolean[13]);
		Scanner scn = new Scanner(System.in);
		for(int n = scn.nextInt(); n-- > 0;){
			card.get(scn.next().charAt(0))[scn.nextInt()-1] = true;
		}
		for(int i = 0; i < 13; i++) if(!card.get('S')[i]) System.out.println('S' + " " + (i + 1));
		for(int i = 0; i < 13; i++) if(!card.get('H')[i]) System.out.println('H' + " " + (i + 1));
		for(int i = 0; i < 13; i++) if(!card.get('C')[i]) System.out.println('C' + " " + (i + 1));
		for(int i = 0; i < 13; i++) if(!card.get('D')[i]) System.out.println('D' + " " + (i + 1));
	}
}