import java.util.Scanner;

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
		for(int i = 0; i < n; i++){
			String[] str = new String[2];
			str[0] = sc.next();
			str[1] = sc.next();
			if(str[0].length() > 80 || str[1].length() > 80){
				System.out.println("overflow");
				continue;
			}
			int[][] num = new int[2][80];
			for(int j = 0; j < 2; j++){
				//initialize
				for(int k = 0; k < 80; k++){
					num[j][k] = 0;
				}
				int len = str[j].length();
				//System.out.println(len);
				for(int k = 0; k < len; k++){
					char c = str[j].charAt((len - 1) - k);
					num[j][k] = Character.getNumericValue(c);
				}
			}
			//print(num[0]);
			//print(num[1]);
			boolean bUp = false;
			int[] ans = new int[80];
			for(int j = 0; j < 80; j++){
				int tmp = num[0][j] + num[1][j];
				if(bUp){
					tmp++;
					bUp = false;
				}
				if(tmp >= 10){
					tmp = tmp%10;
					bUp = true;
				}
				ans[j] = tmp;
			}
			if(bUp){
				System.out.println("overflow");
				continue;
			}

			//print(ans);
			int start = 79;
			//0は飛ばす
			while(start >= 0 && ans[start] == 0){
				start--;
			}
			if(start == -1){
				System.out.println(0);
			}
			else{
				for(int j = start; j >= 0; j--){
					System.out.print(ans[j]);
				}
				System.out.println("");
			}
			//String2Int[]
		}
	}
	
	public static void print(int[] array){
		int len = array.length;
		for(int i = 0; i < len; i++){
			System.out.print(array[i]);
		}
		System.out.println("");
	}
 
}