import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int min = 753;
		for(int i = 0; i < st.length() - 2; i ++) {
			min = Math.min(min, Math.abs(Integer.parseInt(st.substring(i, i + 3)) - 753));
		}
		System.out.println(min);
	}
}