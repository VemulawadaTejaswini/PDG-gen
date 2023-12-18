import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int A = sc.nextInt();
		int B = sc.nextInt();			
		int ans=0;

		if(A>=13){		
		ans = B;	
		}
		if(6<=A &&A<=12){		
		ans = B/2;	
		}	 
		System.out.println(ans);
	}
}