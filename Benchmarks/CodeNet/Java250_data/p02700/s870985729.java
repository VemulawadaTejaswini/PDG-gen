import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String ans = "Yes";
		while(A > 0 && C > 0){
			A -= D;
			C -= B;
		}
		if(C <= 0){
			ans = "Yes";
		}else{
			ans = "No";
		}
		System.out.println(ans);
	}
}