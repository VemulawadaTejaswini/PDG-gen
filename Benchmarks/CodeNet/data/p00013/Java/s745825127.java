import java.util.Scanner;							
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stock = new int[100];
		int input, ST, output;
		
		while(sc.hasNext()){
			input = sc.nextInt();
			if(input == 0){
				ST = seach(stock);
				output = stock[ST -1];
				System.out.println(output);
				stock[ST-1] = 0;
			}else{
				ST = seach(stock);
				stock[ST] = input;
			}
		}
	}
	
	static int seach(int[] stock){
		int k = 0;
		for(int i = 0; i < stock.length; i++){
			if(stock[i] == 0){
				k = i;
				return k;
			}
		}
		return k;
	}
}