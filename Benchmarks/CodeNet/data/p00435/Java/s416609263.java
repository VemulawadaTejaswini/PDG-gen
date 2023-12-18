//Volume5-0512
import java.util.HashMap;
import java.util.Scanner;

class Main {



	private static HashMap<Character,Character> tr = new HashMap<Character,Character>();

	public static void main(String[] args){

		char[] c;
		String s = "";

		init();

		Scanner sc = new Scanner(System.in);
		c = sc.nextLine().toCharArray();
		for(int i=0;i<c.length;i++){
			s += tr.get(c[i]);
		}
		System.out.println(s);
	}

	private static void init(){
	tr.put('D', 'A');
	tr.put('E', 'B');
	tr.put('F', 'C');
	tr.put('G', 'D');
	tr.put('H', 'E');
	tr.put('I', 'F');
	tr.put('J', 'G');
	tr.put('K', 'H');
	tr.put('L', 'I');
	tr.put('M', 'J');
	tr.put('N', 'K');
	tr.put('O', 'L');
	tr.put('P', 'M');
	tr.put('Q', 'N');
	tr.put('R', 'O');
	tr.put('S', 'P');
	tr.put('T', 'Q');
	tr.put('U', 'R');
	tr.put('V', 'S');
	tr.put('W', 'T');
	tr.put('X', 'U');
	tr.put('Y', 'V');
	tr.put('Z', 'W');
	tr.put('A', 'X');
	tr.put('B', 'Y');
	tr.put('C', 'Z');
	}
}