import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		for(int i = 0;i < 3; ++i){
			int input = Integer.parseInt(scan.next());
			sum += input;
			max = Math.max(max,input);
		}
		int ans = 0;
		while(sum < max*3 || sum%3 != 0){
			sum += 2;
			++ans;
		}
		System.out.print(ans);
	}
}


