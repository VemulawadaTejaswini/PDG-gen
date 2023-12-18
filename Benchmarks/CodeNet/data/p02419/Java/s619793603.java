import java.util.*;

public class Main {

	public static void main(String[] args) {
		String w, temp;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		w = sc.next();
		while (true) {
			temp = sc.next();
			if(temp.equals(w))
				counter++;
			if(temp.equals("END_OF_TEXT"))
				break;
		}
		System.out.println(counter);
	}

}