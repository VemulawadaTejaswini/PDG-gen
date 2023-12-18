import java.util.Scanner;

/**
 * @author kmori
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();

	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n != 0){
			int[] seq = new int[n];
			for(int i = 0; i < n; i++){
				seq[i] = sc.nextInt();
			}
			//iから始まる列の最大値
			int[] max = new int[n];
			max[n - 1] = seq[n - 1];
			int m = max[n - 1];
			for(int i = n - 2; i >= 0; i--){
				max[i] = seq[i];
				if(max[i + 1] > 0){
					max[i] += max[i + 1];
				}
				if(max[i] > m){
					m = max[i];
				}
			}
			System.out.println(m);
			n = sc.nextInt();
		}
	}

}