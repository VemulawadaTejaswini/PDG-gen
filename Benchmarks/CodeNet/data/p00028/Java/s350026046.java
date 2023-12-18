import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int input, max=0;
	static int counter[] = new int[100];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//出現カウンタ初期化
		Arrays.fill(counter, 0);
		
		while(read()){
		}
		
		solve();
	}
		
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		input = sc.nextInt();
		counter[input-1]++;
		
		return true;
	}

	public static void solve(){
				
		for(int i=0; i < counter.length; i++){
			if(max < counter[i]){
				max = counter[i];
			}
		}
		for(int i=0; i < counter.length; i++){
			if(max == counter[i]){
				System.out.println(i+1);
			}
		}
	}
}