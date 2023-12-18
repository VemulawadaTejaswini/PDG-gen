
import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S[] = sc.nextLine().split(" ");

		Arrays.sort(S);
		System.out.print(S[0] +" "+ S[1] +" "+ S[2]);
	}

}