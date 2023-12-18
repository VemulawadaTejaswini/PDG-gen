import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
public class Main {
	
	public static class Ant {
		int pos, id, dir;
		boolean turned;
		
		public Ant(int id, int pos, int dir) {
			this.id = id;
			this.pos = pos;
			this.dir = dir;
			this.turned = false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int l = sc.nextInt();
			
			if(n == 0 || l == 0){
				break;
			}
			
			ArrayList<Ant> ants = new ArrayList<Ant>();
			ArrayList<Ant> nexts = new ArrayList<Ant>();
			
			for(int i = 0; i < n; i++){
				final String dir = sc.next();
				final int pos = sc.nextInt();
				
				if("L".equals(dir)){
					ants.add(new Ant((i + 1), pos, -1));
				}else{
					ants.add(new Ant((i + 1), pos, 1));
				}
			}
			
			int answer_time = 0, answer_num = 0;
			for(int time = 0; !ants.isEmpty(); time++){
				for(final Ant ant : ants){
					ant.pos += ant.dir;
				}
				
				for(Iterator<Ant> ant_itr = ants.iterator(); ant_itr.hasNext(); ){
					final Ant ant = ant_itr.next();
					
					if(ant.pos > l){
						answer_time = time;
						answer_num = ant.id;
						ant_itr.remove();
					}
				}
				for(Iterator<Ant> ant_itr = ants.iterator(); ant_itr.hasNext(); ){
					final Ant ant = ant_itr.next();
					
					if(ant.pos < 0){
						answer_time = time;
						answer_num = ant.id;
						ant_itr.remove();
					}
				}
				
				for(final Ant ant_1 : ants){
					if(ant_1.turned){ continue; }
					
					for(final Ant ant_2 : ants){
						if(ant_2.turned){ continue; }
						if(ant_1 == ant_2){ continue; }
						if(ant_1.pos != ant_2.pos){ continue; }
						
						ant_1.turned = ant_2.turned = true;
						ant_1.dir = -ant_1.dir;
						ant_2.dir = -ant_2.dir;
					}
				}
				
				for(final Ant ant : ants){
					ant.turned = false;
					//System.out.println(ant.id + " " + ant.pos + " " + ant.dir);
				}
				//System.out.println();
			}
			
			System.out.println(answer_time + " " + answer_num);
		}
		
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
 
}