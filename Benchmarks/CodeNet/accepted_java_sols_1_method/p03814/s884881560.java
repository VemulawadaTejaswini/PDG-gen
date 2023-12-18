import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int min = S.length;
		int max = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] == 'A' && min > i) min = i;
			else if(S[i] == 'Z' && max < i) max = i; 
		}
		System.out.println(max - min + 1);
	}
}