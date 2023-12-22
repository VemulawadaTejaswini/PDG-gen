import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String half = S.substring(0, N /2);
		if(N % 2 ==0 && S.matches(half.concat(half))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
