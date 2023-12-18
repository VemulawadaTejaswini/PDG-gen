import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		double totalW = Integer.parseInt(tmpArray[1]);
		
		Item[] items = new Item[n];
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			
			int value = Integer.parseInt(tmpArray[0]);
			int weight = Integer.parseInt(tmpArray[1]);
			
			items[i] = new Item(value, weight);
		}
		
		Arrays.sort(items);
		
		double result = 0;
		for(int i = 0; i < n && totalW > 0 ; i++){
		//	System.out.println(items[i].valuePerWeight);
			
			double w1 = Math.min(items[i].weight, totalW);
			result += w1 * items[i].valuePerWeight;
			
			totalW -= w1;
		}
		
		System.out.printf("%.8f\n", result);
	}

}

class Item implements Comparable<Item>{
	int value;
	int weight;
	double valuePerWeight;
	
	Item(int v, int w){
		value = v;
		weight = w;
		valuePerWeight = (double)value/weight;
	}

	@Override
	public int compareTo(Item item1) {
		// TODO Auto-generated method stub
		if(this.valuePerWeight < item1.valuePerWeight){
			return 1;
		}
		else if(this.valuePerWeight > item1.valuePerWeight){
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
}
