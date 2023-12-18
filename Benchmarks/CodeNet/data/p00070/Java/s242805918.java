import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

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
			int[] a  =new int[n];
			Arrays.fill(a, -1);
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
			sum += (depth+1)*i;

			dfs(depth+1, sum);
			sum = tmp;
			already[i]=false;
		}
	}
	static boolean is(int[] a){
		int sum=0;
		for(int i = 0; i < a.length;i++){
			if(a[i]>=0){
			sum += a[i]*(i+1);
			}
		}
		return sum==s;
	}
}