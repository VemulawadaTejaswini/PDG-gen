import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int ans = 0;
			if(n==0 && s==0)break;
			if(n != 0)ans = solve(n,s,0);
			System.out.println(ans);
		}
	}
	public static int solve(int n,int s,int c){
		if(n==1&&s>=c&&s<10) return 1;
		if(n == 1) return 0;
		int sum = 0;
		for(int i=c;i<10&&i<s;i++){
			sum += solve(n-1,s-1,i+1);
		}
		return sum;
		
	}
}

