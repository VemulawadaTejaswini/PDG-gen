import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, s, count;
	static int[][] memo;
	static ArrayList<Integer> list = new ArrayList<Integer>();
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
			memo = new int[11][10000];
			for(int i = 0; i < 10;i++){
				for(int j = 0; j < 10000;j++){
					memo[i][j]=-1;
				}
			}

			for(int i = 0; i < 10;i++){
				list.add(i);
			}
			dfs(0, 0, 0);
			System.out.println(count);
		}
	}
	static void dfs(int depth, int sum, int already){
		if(sum > s){
			return ;
		}
		if(depth == n){
			if(sum==s){
				count++;
			}
			return;
		}
		for(int i = 0; i < 10;i++){
			int pow = 1 << i;
			int al = already >> i;
			if(al%2==1){
				continue;
			}
			int tmp = sum;
			sum += (n-depth)*i;
			al = already+pow;
			dfs(depth+1, sum, al);
			sum = tmp;
		}
	}
}