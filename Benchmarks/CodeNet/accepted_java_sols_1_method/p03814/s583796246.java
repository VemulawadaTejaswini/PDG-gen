import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int minIndex = -1, maxIndex = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'A' && minIndex < 0) minIndex = i;
			else if(c == 'Z' && i > maxIndex) maxIndex = i;
		}
		System.out.println(maxIndex - minIndex + 1);
	}

}
