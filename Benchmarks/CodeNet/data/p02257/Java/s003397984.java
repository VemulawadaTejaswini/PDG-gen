
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}
		int etc = (int)Math.sqrt(100000000)+3;
		boolean[] prime = new boolean[etc];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<etc;i++){
			if(prime[i]){
				list.add(i);
				for(int j=i*2;j<etc;j=j+i){
					prime[j] = false;
				}
			}
		}

		int count = 0;
		for(int i=0;i<n;i++){
			boolean flag = true;
			for(int j=0;j<list.size();j++){
				int x = list.get(j);
				if(num[i] <= x){
					break;
				}
				if(num[i]%x==0){
					flag = false;
				}
			}
			if(flag){
				count++;
			}
		}

		System.out.println(count);

	}
}


