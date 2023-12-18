import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			String W = sc.nextLine();
			String T = "";
			int count = 0;
			while(true) {
				String s = sc.nextLine();
				if (s.equals("END_OF_TEXT")) break;
				T += " " + s;
			}
			String[] Sp = T.split(" ");
			String s = "";
			for (int i=0; i<Sp.length; i++) {
				s = Sp[i].toLowerCase();
				if (s.equals(W)) count++;
			}
			System.out.println(count);
		}
	}
}
