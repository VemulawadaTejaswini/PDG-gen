import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String W = stdIn.next();
		int count = 0;
		while(true){
			String s = stdIn.next();
			if(s.equals("END_OF_TEXT"))
				break;
			s = s.toLowerCase();
			if(W.equals(s))
				count ++;
		}
		System.out.println(count);
	}
}