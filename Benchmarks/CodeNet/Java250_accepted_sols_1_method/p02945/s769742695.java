import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans1 = a + b;
		int ans2 = a - b;
		int ans3 = a * b;
		int ans = Math.max(ans1, Math.max(ans2,ans3));
		System.out.println(ans);
	}
	
	
	}