import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number_of_data_set, number_of_block;
	static int[] block;
	public static void main(String[] args) {
		number_of_data_set = sc.nextInt();
		for(int i = 0; i < number_of_data_set; i++){
			read();
			solve();
		}
	}
	static void read(){
		number_of_block = sc.nextInt();
		block = new int[number_of_block];
		for(int i = 0; i < number_of_block; i++)
			block[i] = sc.nextInt();
	}
	static void solve(){
		if(number_of_block == 2){
			if(block[0] > block[1]){
				System.out.println(0 + " " + (block[0]-block[1]));
			}else if(block[0] < block[1]){
				System.out.println((block[1]-block[0]) + " " + 0);
			}else{
				System.out.println(0 + " " + 0);
			}
		}else{
			int []diff = new int[number_of_block-1];
			for(int i = 0; i < number_of_block-1; i++)
				diff[i] = block[i+1] - block[i];
			Arrays.sort(diff);
			System.out.println(diff[number_of_block-2] + " " + -(diff[0]));
		}
	}

}