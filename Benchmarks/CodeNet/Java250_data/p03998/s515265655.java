import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String sa = scan.nextLine();
		List<String> a_list = new ArrayList<String>();
		for(i = 0; i < sa.length(); i++) {
			a_list.add(sa.charAt(i) + "");
		}
		String sb = scan.nextLine();
		List<String> b_list = new ArrayList<String>();
		for(i = 0; i < sb.length(); i++) {
			b_list.add(sb.charAt(i) + "");
		}
		String sc = scan.nextLine();
		List<String> c_list = new ArrayList<String>();
		for(i = 0; i < sc.length(); i++) {
			c_list.add(sc.charAt(i) + "");
		}
		
		String card = a_list.get(0);
		a_list.remove(0);
		String winner = "";
		if(a_list.size() == 0) {
			winner = "A";
		}
		
		for(; ;) {
			if(card.equals("a")) {
				if(a_list.size() == 0) {
					winner = "A";
					break;
				}
				card = a_list.get(0);
				a_list.remove(0);
				
			} else if(card.equals("b")) {
				if(b_list.size() == 0) {
					winner = "B";
					break;
				}
				card = b_list.get(0);
				b_list.remove(0);
				
			} else if(card.equals("c")) {
				if(c_list.size() == 0) {
					winner = "C";
					break;
				}
				card = c_list.get(0);
				c_list.remove(0);
				
			}
		}
		
		System.out.println(winner);
	}
}