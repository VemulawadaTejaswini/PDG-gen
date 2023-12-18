import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		for(;;){
			String input = scan.next();
			if(input.equals("-")){
				break;
			}
			List<Character> listC = new ArrayList<Character>();
			int n = input.length();
			for(int i = 0; i < n; i++){
				char c = input.charAt(i);
				listC.add(c);
			}
			int m = scan.nextInt();
			for(int i = 0; i < m; i++){
				int h = scan.nextInt();
				shuffle(h, listC);
			}

			for(char c : listC){
				System.out.print(c);
			}
			System.out.println("");
		}
	}

	private static void shuffle(int hh, List list){
		for(int i = 0; i < hh; i++){
			char cc = list.get(i);
			list.remove(i);
			list.add(cc);
		}
	}
}