import java.util.*;

public class Main {
	int[] a;
	
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
		
		while(sc.hasNext()){
			boolean[] f = new boolean[76543211];
			a = new int[8];
			for(int i=0;i<8;i++) a[i] = sc.nextInt();
			
			ArrayDeque<int[]> que = new ArrayDeque<int[]>();
			que.offer(a);
			
			int zero = -1;
			int id;
			boolean flag = false;
			for(int cnt=0;;cnt++){
				int z = que.size();
				for(int i=0;i<z;i++){
					a = que.poll();
					id = sum(a);
					
					if(id==1234567){
						System.out.println(cnt);
						flag = true;
						break;
					}
					f[id] = true;
					
					for(int j=0;j<8;j++){
						if(a[j]==0) zero = j;
					}
					
					if(zero!=3 && zero!=7){
						int[] c = swap(zero, zero+1);
						id = sum(c);
						if(f[id]==false) que.offer(c);
					}
					if(zero!=0 && zero!=4){
						int[] c = swap(zero, zero-1);
						id = sum(c);
						if(f[id]==false) que.offer(c);
					}
					if(zero<4){
						int[] c = swap(zero, zero+4);
						id = sum(c);
						if(f[id]==false) que.offer(c);
					}else{
						int[] c = swap(zero, zero-4);
						id = sum(c);
						if(f[id]==false) que.offer(c);	
					}
				}
				if(flag==true) break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}