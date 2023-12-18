import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static class Treasure implements Comparable<Treasure>{
		private int prise;
		private int weight;
		
		public Treasure(int p,int w){
			prise = p;
			weight = w;
		}
		
		int get_weight(){
			return weight;
		}
		
		int get_prise(){
			return prise;
		}
		
		public String toString(){
			return "prise = " + prise + ", wight = " + weight;
		}
		
		public int compareTo(Treasure t){
			if(this.weight == t.weight){
				return 0;
			}else if(this.weight > t.weight){
				return -1;
			}else{
				return 1;
			}
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = 1;
		
		while(true){
			final int W = Integer.parseInt(sc.nextLine());
			
			if(W == 0){
				break;
			}
			
			final int N = Integer.parseInt(sc.nextLine());
			
			Treasure treasures[] = new Treasure[N];
			
			for(int i = 0;i < N;i++){
				String str[] = sc.nextLine().split(",");
				treasures[i] = new Treasure(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
			}
			
			Arrays.sort(treasures);
			
			List<Treasure> list = new ArrayList<Treasure>();
			int p_sum = 0;
			int w_sum = 0;
			for(Treasure t:treasures){
				list.add(t);
				w_sum += t.get_weight();
				if(w_sum > W){
					list.remove(t);
					w_sum -= t.get_weight();
				}else{
					p_sum += t.get_prise();
				}
			}
			
			System.out.println("Case 1:");
			System.out.println(p_sum);
			System.out.println(w_sum);
			
			number++;
		}
	}
}