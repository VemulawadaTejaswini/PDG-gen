import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int v = s.nextInt() + s.nextInt();
			System.out.println(String.valueOf(v).length());
		}
	}
}

