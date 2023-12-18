import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static int[] codeBook;
	public static int[] input;
	//size of codeBook
	public static int m;
	//size of input
	public static int n;
	//差分の最大値
	public static final int max = (255*2)*(255*2)*20000;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		while(n != 0){
			codeBook = new int[m];
			for(int i = 0; i < m; i++){
				codeBook[i] = sc.nextInt();
			}
			input = new int[n];
			for(int i = 0; i < n; i++){
				input[i] = sc.nextInt();
			}
			int result = DP(0, 0, max, 128);
			System.out.println(result);
			
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
	}
	
	//y[count-1]までが既にうまっている場合にその先を決めてその中の最小数を返す関数。
	//sum : ここまでの差分の合計値	min : 現状分かっている最小値	y： ひとつ前のy(Yn-1)
	public static int DP(int count, int sum, int min, int y){
		//System.out.println("count = " + count + " , sum = " + sum+ " , min = " + min+ " , y = " + y);
		int minimum = min;
		int Yn = 0;
		//最後の場合は一番小さくなるやつを返す
		if(count == n - 1){
			for(int i = 0; i < m; i++){
				Yn = y + codeBook[i];
				if(Yn < 0){
					Yn = 0;
				}
				else if(Yn > 255){
					Yn = 255;
				}
				int dif = input[count] - Yn;
				int res = dif*dif;
				if(res < minimum){
					minimum = res;
				}
			}
			minimum += sum;
		}
		else{
			for(int i = 0; i < m; i++){
				Yn = y + codeBook[i];
				if(Yn < 0){
					Yn = 0;
				}
				else if(Yn > 255){
					Yn = 255;
				}
				int dif = input[count] - Yn;
				int newSum = sum + dif*dif;
				if(newSum < minimum){
					int tmp = DP(count+1, newSum, minimum,Yn);
					if(tmp < minimum){
						minimum = tmp;
					}
				}
			}
		}
		
		return minimum;
	}

}