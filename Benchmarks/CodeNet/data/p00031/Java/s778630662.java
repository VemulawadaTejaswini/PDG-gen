import java.util.Scanner;
public class Main {
	static int num, idx = 0;
	
	
	static int dfs(int pos, int[] weight) {
		int ret = 0;
		if(pos >= weight.length) return(0);
		
		ret += dfs(pos + 1, weight);
	
		if(num - weight[pos] >= 0) {
			num -= weight[pos];
			ret += weight[pos];
		}
		
		return(ret);
	}
	
	static int len(int[] array) {
		int len = 0;
		for(int r = 0; r < 10; r++) {
			if(array[r] == 0) break;
			len++;
		}
		return(len);
	}
	
	static void input(int numeric, int[] weight, int[] input) {
		//System.out.println("numeric = " + numeric);
		int count = 0;
		for(int r = 9; r >= 0; r--) {
			int minus = weight[r];
			if(numeric - minus >= 0) {
				input[count++] = minus;
				numeric -= minus;
			}
		}
	}
	
	static void output(int[] output) {
		int len = len(output);
		for(int r = len - 1; r >= 0; r--) {
			System.out.print(output[r]);
			if(r != 0) System.out.print(" "); 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[] weight = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		while(stdIn.hasNext()) {
			int[] output = new int[10];
			num = stdIn.nextInt();
			input(dfs(0, weight), weight, output);
			output(output);
			System.out.println();
			idx = 0;
		}
	}	
}