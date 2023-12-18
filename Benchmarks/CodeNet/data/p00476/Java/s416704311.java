import java.awt.Point;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class SegTree{
		int n;
		long[] life;
		long[] heal;

		public SegTree(int n_) {
			int n = 1;
			while(n < n_){
				n *= 2;
			}
			
			this.n = n;
			life = new long[this.n * 2 - 1];
			heal = new long[this.n];
			for(int i = 0; i < this.n * 2 - 1 ; i++){
				life[i] = 0;
			}
			for(int i = 0; i < this.n; i++){
				heal[i] = 0;
			}
		}
		
		public void update(int k, long a){
			k += n - 1;
			life[k] = a;
			
			while(k > 0){
				k = (k - 1) / 2;
				//dat[k] = Math.max(dat[k * 2 + 1], dat[k * 2 + 2]);
				life[k] = life[k * 2 + 1] + life[k * 2 + 2];
			}
		}
		
		public void update_add(int k, long a){
			k += n - 1;
			life[k] += a;
			
			while(k > 0){
				k = (k - 1) / 2;
				//dat[k] = Math.max(dat[k * 2 + 1], dat[k * 2 + 2]);
				life[k] = life[k * 2 + 1] + life[k * 2 + 2];
			}
		}
		
		public void heal_update(int k, long a){
			heal[k] = a;
		}
		
		public long query(int a, int b, int k, int l, int r){
			if(r <= a || b <= l){
				return 0;
			}else if(a <= l && r <= b){
				return life[k];
			}else {
				return query(a, b, k * 2 + 1, l, (l + r) / 2) + query(a, b, k * 2 + 2 , (l + r) / 2, r);
				//return Math.max(query(a, b, k * 2 + 1, l, (l + r) / 2), query(a, b, k * 2 + 2 , (l + r) / 2, r));
			}
		}
		
		public long heal(int limit_floor, long H, long damage){
			int max_floor = -1;
			long max_single = Long.MIN_VALUE;
			long heal_count = 1;
			long heal_val = -1;
			
			for(int floor = limit_floor - 1; floor > 0; floor--){
				final long cur_hp = this.query(0, floor + 1, 0, 0, this.n);
				final long max_diff = H - cur_hp;
				
				final long single = Math.min(H - cur_hp, heal[floor]);
				
				if(single > max_single){
					max_single = single;
					heal_val = single;
					max_floor = floor;
				}
				
				/*
				//System.out.println(floor);
				long hp_use = (H - cur_hp) / heal[floor];
				if(H - cur_hp != 0 && hp_use == 0){
					hp_use++;
				}
				
				long damage_use = damage / heal[floor];
				if(damage % heal[floor] != 0){
					damage_use++;
				}
				//System.out.println(H + " " + cur_hp + " " + heal[floor] + " " + hp_use + " " + damage_use);
				
				final long min_use = Math.min(hp_use, damage_use);
				final long healing = Math.min(max_diff, min_use * heal[floor]);
				
				if(min_use <= 0){
					continue;
				}
				
				if(single >= max_single){
					if(single > max_single || heal_count > min_use){
						heal_count = min_use;
						heal_val = healing;
						max_single = single;
						max_floor = floor;
					}
				}
				*/
				
			}
			
			
			this.update_add(max_floor, heal_val);
			
			return heal_count;
		}
		
		public int size(){
			return n;
		}
		
		public String toString(){
			return Arrays.toString(life);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N  = sc.nextInt();
		final long H = sc.nextLong();
		
		SegTree seg = new SegTree(N);
		seg.update(0, H);
		
		for(int i = 1; i < N; i++){
			final long d = sc.nextLong();
			final long h = sc.nextLong();
			
			seg.update(i, -d);
			seg.heal_update(i, h);
		}
		
		//System.out.println(Arrays.toString(seg.life));
		
		long count = 0;
		
		for(int i = 0; i < N; i++){
			while(true){
				final long damage = seg.query(0, i + 1, 0, 0, seg.size());
				if(damage >= 0){
					break;
				}

				//System.out.println(i + " " + seg.query(0, i + 1, 0, 0, seg.size()));
				//System.out.println(seg);
				count += seg.heal(i, H, -damage + 1);
				//System.out.println(count + " " + seg);
				//System.out.println(i + " " + seg.query(0, i + 1, 0, 0, seg.size()));
				//System.out.println("------------------------------------------");
			}
		}
		
		System.out.println(count);
	}
}