import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int k = Integer.parseInt(tmpArray[1]);
			
			int pos[] = new int[n];
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < n; j++){
				pos[j] = Integer.parseInt(tmpArray[j]);
			}
			
			System.out.println(solve(pos, k));
			
		}
	}
	
	static int solve(int[] pos, int k){
		int n = pos.length;
		
		House[] houses = new House[n];
		for(int i = 0; i < n; i++){
			houses[i] = new House(i, pos[i]);
			if(i != 0){
				houses[i].dist = houses[i].x - houses[i - 1].x;
			}
		}
		
		Arrays.sort(houses);
		//debug
//		for(int i = 0; i < n; i++){
//			System.out.print(houses[i].dist+" ");
//		}
//		
//		System.out.println();
		
		int result = pos[n - 1] - pos[0];
		
		int tmp = 0;
		for(int i = n - 1 ; i > 0  && tmp < k - 1; i--){
//			System.out.println("i = "+i);
			result -= houses[i].dist;
			tmp++;
		}
		
		return result; 
	}

}

class House implements Comparable<House>{
	int x;
	int id;
	int dist;
	
	public House(int id, int x){
		this.id = id;
		this.x = x;
		this.dist = 0;
	}

	@Override
	public int compareTo(House h) {
		// TODO Auto-generated method stub
		return (this.dist - h.dist);
	}
}
