import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static int[] codeBook = null;
	public static int[] input = null;
	//size of codeBook
	public static int m = 0;
	//size of input
	public static int n = 0;
	public static final int max = (255*2)*(255*2)*20000;

	public static void main(String[] args) {
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

	public static int DP(int count, int sum, int min, int y){
		//System.out.println("count = " + count + " , sum = " + sum+ " , min = " + min+ " , y = " + y);
		int minimum = min;
		int Yn = 0;
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