import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int d = stdIn.nextInt();
		int x = stdIn.nextInt();
		int num = 0;
		int ans;
		int [] an = new int[n];
		for(int i = 0; i < n; i++){
			an[i] = stdIn.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j*an[i]+1 <= d; j++)
				num++;
		}
		ans = num + x;
		System.out.println(ans);
	}
}