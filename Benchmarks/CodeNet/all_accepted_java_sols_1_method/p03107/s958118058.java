import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] Sarray = S.split("");
		int num0 = 0;
		int num1 = 0;
		int answer = 0;
		for(int i = 0; i < S.length(); i++) {
			if(Sarray[i].equals("0")) num0 += 1;
			else num1 += 1;
		}
		if(num0 < num1) answer = num0*2;
		else answer = num1*2;
		System.out.println(answer);
		}

}
