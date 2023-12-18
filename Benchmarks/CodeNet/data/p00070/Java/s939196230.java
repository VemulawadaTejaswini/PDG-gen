import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, s, count;
	static boolean[] already;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			n = cin.nextInt();
			s = cin.nextInt();
			if(n>10){
				System.out.println(0);
				continue;
			}
			count=0;
			already = new boolean[10];
			dfs(0, 0);
			System.out.println(count);
		}
	}
	static void dfs(int depth, int sum){
		if(sum > s){
			return;
		}
		if(depth == n){
			if(sum==s){
				count++;
			}
			return;
		}
		for(int i = 0; i < 10;i++){
			if(already[i]){
				continue;
			}
			already[i]=true;
			int tmp = sum;
			sum += (n-depth)*i;

			dfs(depth+1, sum);
			sum = tmp;
			already[i]=false;
		}
	}
}