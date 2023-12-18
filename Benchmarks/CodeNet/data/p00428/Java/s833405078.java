import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static class Place implements Comparable<Place>{
		int number;
		int freq;
		
		Place(int n, int f){
			number = n;
			freq = f;
		}
		
		@Override
		public int compareTo(Place arg0) {
			return arg0.freq - this.freq;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			Place[] places = new Place[m];
			
			for(int i = 0; i < m; i++){
				places[i] = new Place(i+1, 0);
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					int t = sc.nextInt();
					if(t == 1){
						places[j].freq++;
					}
				}
			}
			
			Arrays.sort(places);
			boolean first = true;
			for(Place p : places){
				if(first){
					System.out.print(p.number);
					first = false;
				}else{
					System.out.print(" " + p.number);
				}
			}
			System.out.println();
		}
	}

}