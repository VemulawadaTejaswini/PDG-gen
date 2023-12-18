import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

	static int[][] input;
	static int cnt;
	public static void main(String[] args) {
		int result = 0;
		Scanner s = new Scanner(System.in);
		cnt = Integer.parseInt(s.nextLine());
		input = new int[cnt][2];
		for(int i=0 ; i<cnt ; i++) {
			String[] array = s.nextLine().split(" ");
			input[i][0] = Integer.parseInt(array[0]);
			input[i][1] = Integer.parseInt(array[1]);
		}
		for(int i=0 ; i<cnt ; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(input[i][0]);list.add(input[i][1]);
			result = Math.max(solve(list,i+1), result);
		}
		System.out.println(result + 2);
	}

	public static int solve(List<Integer> list, int c) {
		if(c==cnt)
			return 0;
		if((list.contains(input[c][0]) && !list.contains(input[c][1]))) {
			list.add(input[c][1]);
			return solve(list, c+1) + 1;
		}else if((!list.contains(input[c][0]) && list.contains(input[c][1]))) {
			list.add(input[c][0]);
			return solve(list, c+1) + 1;
		}else
			return solve(list, c+1);
	}
}