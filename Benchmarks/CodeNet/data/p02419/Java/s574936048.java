import java.util.*;

public class Main {

	public static void main(String[] args) {
		String w, temp;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		w = sc.next().toLowerCase();
		while (true) {
			temp = sc.next();
			if(temp.toLowerCase().equals(w))
				counter++;
			if(temp.equals("END_OF_TEXT"))
				break;
		}
		System.out.println(counter);
	}

}