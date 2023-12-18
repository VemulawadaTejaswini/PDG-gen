import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static class Path implements Comparable<Path>{
		private int to,from,len;
		
		public Path(int f,int t,int l){
			from = f;
			to = t;
			len = l;
		}
		
		public int get_from(){
			return from;
		}
		
		public int get_to(){
			return to;
		}
		
		public int get_len(){
			return len;
		}
		
		public int compareTo(Path p){
			return this.get_len() - p.get_len(); 	
		}
		
		public String toString(){
			return "From " + from + ". To " + to + ". len " + len +".";
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){break;}
			int m = sc.nextInt();
			
			Set<Path> paths = new TreeSet<Path>();
			Set<Integer> visited_place = new HashSet<Integer>(n);
			
			for(int i = 0; i < m; i++){
				String strs[] = sc.next().split(",");
				paths.add(new Path(Integer.parseInt(strs[0]),Integer.parseInt(strs[1]),Integer.parseInt(strs[2])));
			}
			
			int sum = 0;
			
			Iterator<Path> ite = paths.iterator();
			while(visited_place.size() != n){
				if(!ite.hasNext()){
					break;
				}
				
				Path p = ite.next();
				if(visited_place.contains(p.get_from()) && visited_place.contains(p.get_to())){
					continue;
				}
				
				visited_place.add(p.get_from());
				visited_place.add(p.get_to());
				sum += p.get_len()/100 - 1;
			}
			
			System.out.println(sum);
			
		}
	}
}