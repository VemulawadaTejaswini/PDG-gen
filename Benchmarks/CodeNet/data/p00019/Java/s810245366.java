import java.util.Scanner;
class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(answar(n));
		}

	}
	static int answar(int n){
		int ans=1;
		for(int i=1;i<=n;i++){
			ans *= i;
		}

		return ans;
	}
}