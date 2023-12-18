import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	static int n, x, sum=0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		if(n == 0 && x == 0) return false;
		
		return true;
	}
	
	static void solve(){
		
		for(int i=1; i <= n-2; i++){
			for(int j=i+1; j <= n-1; j++){
				for(int k=j+1; k <= n; k++){
					if((i + j + k) == x){
						sum++;
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}