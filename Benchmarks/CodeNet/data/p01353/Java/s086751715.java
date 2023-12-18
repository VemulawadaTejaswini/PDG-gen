import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
public class Main {
	
	public static class Monster implements Comparable<Monster>{
		static long usagi_hp;
		static long usagi_atk;
		static long usagi_def;
		static long usagi_spd;
		
		long hp;
		long atk;
		long def;
		long spd;
		
		public Monster(long hp, long atk, long def, long spd) {
			super();
			this.hp = hp;
			this.atk = atk;
			this.def = def;
			this.spd = spd;
		}
		
		public long usagi_attack_per_turn(){
			return Math.max(usagi_atk - this.def, 0);
		}
		
		public long monster_attack_per_turn(){
			return Math.max(this.atk - usagi_def, 0);
		}
		
		public long usagi_destory_turns(){
			final long actual_usagi_atk = usagi_attack_per_turn();
			if(atk == 0){
				return Integer.MAX_VALUE;
			}
			
			long ret = this.hp / actual_usagi_atk;
			if(this.hp % actual_usagi_atk != 0){
				ret++;
			}
			
			return ret;
		}
		
		public long usagi_injured(){
			return usagi_injured(0);
		}
		
		public long usagi_injured(long prefix){
			final long turns = usagi_destory_turns();
			
			return (prefix + turns - (usagi_spd < this.spd ? 0 : 1)) * monster_attack_per_turn();
		}

		@Override
		public int compareTo(Monster arg0) {
			final long own_dmg = this.usagi_injured();
			final long arg_dmg = arg0.usagi_injured();
			
			if(own_dmg > arg_dmg){
				return -1;
			}else if(own_dmg < arg_dmg){
				return 1;
			}else{
				return 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		Monster[] monsters = new Monster[n];
		
		final long u_hp = sc.nextLong();
		final long u_atk = sc.nextLong();
		final long u_def = sc.nextLong();
		final long u_spd = sc.nextLong();
		Monster.usagi_hp = u_hp;
		Monster.usagi_atk = u_atk;
		Monster.usagi_def = u_def;
		Monster.usagi_spd = u_spd;
		
		for(int i = 0; i < n; i++){
			final long hp = sc.nextLong();
			final long atk = sc.nextLong();
			final long def = sc.nextLong();
			final long spd = sc.nextLong();
			
			monsters[i] = new Monster(hp, atk, def, spd);
		}
		
		boolean tumi = false;
		for(Monster monster : monsters){
			tumi |= monster.usagi_attack_per_turn() == 0;
		}
		
		if(tumi){
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(monsters);
		
		long current_hp = Monster.usagi_hp;
		long turn = 0;
		boolean end = false;
		for(Monster monster : monsters){
			//System.out.println(monster.usagi_attack_per_turn());
			//System.out.println(monster.usagi_destory_turns());
			//System.out.println(monster.usagi_injured(turn));
			current_hp -= monster.usagi_injured(turn);
			if(current_hp <= 0){
				end = true;
				break;
			}
			turn += monster.usagi_destory_turns();
		}
		
		System.out.println(end ? -1 : (Monster.usagi_hp - current_hp));
		
	}
	
	public static class Scanner {
		
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException{
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}
		
		private void getLine() throws IOException{
			while(tok == null || !tok.hasMoreTokens()){
				tok = new StringTokenizer(br.readLine());
			}
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public String next() throws IOException{
			if(hasNext()){
				return tok.nextToken();
			}else{
				getLine();
				return tok.nextToken();
			}
		}
		
		public int nextInt() throws IOException{
			if(hasNext()){
				return Integer.parseInt(tok.nextToken());
			}else{
				getLine();
				return Integer.parseInt(tok.nextToken());
			}
		}
		
		public long nextLong() throws IOException{
			if(hasNext()){
				return Long.parseLong(tok.nextToken());
			}else{
				getLine();
				return Long.parseLong(tok.nextToken());
			}
		}
		
		public double nextDouble() throws IOException{
			if(hasNext()){
				return Double.parseDouble(tok.nextToken());
			}else{
				getLine();
				return Double.parseDouble(tok.nextToken());
			}
		}
	}
}