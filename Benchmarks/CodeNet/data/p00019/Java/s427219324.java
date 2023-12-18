import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Main app = new Main();
		int n = sc.nextInt();
		System.out.println(app.answar(n));
		
	}
	int answar(int n){
		int ans=1;
		for(int i=1;i<=n;i++)ans *= i;
		
		return ans;
	}
}