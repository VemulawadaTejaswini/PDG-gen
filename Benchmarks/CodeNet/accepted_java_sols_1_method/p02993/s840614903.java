import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String S = t.nextLine();
		int c = 0;
		int v[] = new int[4];
		for(int i = 0; i < 4; i++) {
			v[i] = S.charAt(i);
		}
		
		if(v[0] == v[1]||v[1] == v[2]||v[2] == v[3]) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
	t.close();
	}
	}

}
