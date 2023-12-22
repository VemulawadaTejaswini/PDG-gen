import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] f = new boolean[1000000];
		
		Arrays.fill(f, true);
		for(int i=2;i<1000000;i++){
			if(f[i]){
				for(int j=i*2;j<1000000;j+=i){
					f[j]=false;
				}
			}
		}
		
		while(scan.hasNext()){
			int n = scan.nextInt();
			int ans = 0;
			for(int i = 2; i <= n; i++){
				ans+= f[i] ? 1 : 0;
			}
			System.out.println(ans);
		}
	}
}