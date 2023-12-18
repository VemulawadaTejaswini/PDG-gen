import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean ans = C - (A - B) > 0;
		int value = C - (A - B);
		if(ans){
			System.out.println(value);
		}
		else{
			System.out.println(0);

		}
	}
}
