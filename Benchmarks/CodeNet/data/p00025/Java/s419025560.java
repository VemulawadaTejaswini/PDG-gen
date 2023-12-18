import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int a[] = new int[4], b[] = new int[4];
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
		if(!sc.hasNext()) return false;
		
		for(int i=0; i < 4; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i < 4;i++){
			b[i] = sc.nextInt();
		}
		
		return true;
	}
	
	static void solve(){
		
		int hit=0, blow=0;
		
		for(int i=0; i < 4; i++){
			if(a[i] == b[i]){
				hit++;
			}
			else{
				for(int j=0; j < 4; j++){
					if(a[i] == b[j]){
						blow++;
					}
				}
			}
		}
		
		System.out.println(hit + " " + blow);
	}

}