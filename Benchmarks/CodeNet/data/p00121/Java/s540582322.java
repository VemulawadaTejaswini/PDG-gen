import java.util.*;

public class Main {
	int[] a;
	int[] ans;
	
	int[] swap(int x, int y){
		int[] b = a.clone();
		int tmp = b[x];
		b[x] = b[y];
		b[y] = tmp;
		return b;
	}
	
	int sum(int[] b){
		int mm = 10000000;
		int ten = mm;
		int sum = 0;
		for(int i=0;i<8;i++){
			sum += b[i]*ten;
			ten /= 10;
		}
		return sum;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		ans = new int[76543211];
		Arrays.fill(ans, -1);
		ans[1234567] = 0;
		
		a = new int[8];
		for(int i=0;i<8;i++) a[i] = i;
		ArrayDeque<int[]> que = new ArrayDeque<int[]>();
		que.offer(a);
		
		int zero = -1;
		int id;
		for(int cnt=0;;cnt++){
			int z = que.size();
			for(int i=0;i<z;i++){
				a = que.poll();
				id = sum(a);
				ans[id] = cnt;
			
				for(int j=0;j<8;j++){
					if(a[j]==0) zero = j;
				}
				
				if(zero!=3 && zero!=7){
					int[] c = swap(zero, zero+1);
					id = sum(c);
					if(ans[id]==-1) que.offer(c);
				}
				if(zero!=0 && zero!=4){
					int[] c = swap(zero, zero-1);
					id = sum(c);
					if(ans[id]==-1) que.offer(c);
				}
				if(zero<4){
					int[] c = swap(zero, zero+4);
					id = sum(c);
					if(ans[id]==-1) que.offer(c);
				}else{
					int[] c = swap(zero, zero-4);
					id = sum(c);
					if(ans[id]==-1) que.offer(c);	
				}
			}
			if(que.size()==0) break;
		}
		
		while(sc.hasNext()){
			int[] input = new int[8];
			for(int i=0;i<8;i++) input[i] = sc.nextInt();
			int num = sum(input);
			System.out.println(ans[num]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}