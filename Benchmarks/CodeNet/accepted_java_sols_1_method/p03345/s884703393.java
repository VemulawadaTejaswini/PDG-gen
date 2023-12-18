import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String K = sc.nextLine();

		int lastK = Integer.parseInt(K.substring(K.length()-1, K.length()));

		int ans;
		if(lastK%2==0) {
			ans = A-B;
		} else {
			ans = B-A;
		}
		System.out.println(ans);
	}
}

