import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ans=1;
		for(int i=0;i<n;i++){
			int buf=ans*2;
			int buf2=ans+k;
			ans=(buf<buf2)?buf:buf2;
		}
		System.out.println(ans);
	}

}
