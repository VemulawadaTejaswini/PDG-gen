import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cnt = s.nextLine();
		int c = Integer.parseInt(cnt);
		int[] input = new int[c];
		for(int i=0 ; i< c ; i++) {
			input[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println(lis(input));
	}

	public static int lis(int[] input) {
		int output = 1;
		int[] calArray = new int[100001];
		Arrays.fill(calArray, (int) (10e9 + 1));
		calArray[0] = -1;
		for(int i=0 ; i<input.length ; i++) {
			int index = Arrays.binarySearch(calArray, input[i]);
			index = index >0 ? index : ~index;
			if(calArray[index] == (int)(10e9 + 1)) {
				calArray[output] = input[i];
				output++;
			}else if(calArray[index] != (10e9 + 1)) {
				calArray[index] = input[i];
			}
//			else {
//				calArray[~index] = input[i];
//			}
		}
		return output -1;
	}
}