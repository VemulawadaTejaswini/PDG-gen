import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char S[] = sc.next().toCharArray();
		int hag = 0;
		int sum = 0;
		for(int i = 0; i < S.length / 2; i++){
			sum += isSame(S[i], S[S.length - 1 - i]) ? 0 : 1;
		}
		System.out.println(sum);

	}

	public static boolean isSame(char a, char b){
		return a == b ? true : false;
	}
}
