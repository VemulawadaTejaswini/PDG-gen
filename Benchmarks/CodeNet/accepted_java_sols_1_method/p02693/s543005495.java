import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String s = "NG";

		for(int i = 0; i <= B - A; i ++){
			int x = A + i;
			if(x % K == 0){
			s = "OK";
			break;
			}
		}

		System.out.println(s);
	}
}