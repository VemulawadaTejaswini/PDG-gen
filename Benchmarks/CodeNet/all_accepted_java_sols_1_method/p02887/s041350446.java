import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		char c = ' ';
		
		for(int i = 0; i < N; i++){
			char x = S.charAt(i);
			if(c != x){
				c = x;
				count++;
			}
		}
		System.out.println(count);
	}
}
