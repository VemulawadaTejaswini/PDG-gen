import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String[] readStandartInput() throws IOException{
		String str = br.readLine();
		String[] list = str.split(" ");
		
		return list;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.valueOf(readStandartInput()[0]);
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			int a = Integer.valueOf(readStandartInput()[0]);
			list.add(a);
		}
		
		
		int old = list.get(0);
		int max = old;
		int min = old;
		int maxBenefit = 0;
		int maxDelta = Integer.MIN_VALUE;
		
		for(int i = 1; i < list.size(); i++){
			int r = list.get(i);
			int delta = r - old;
			if(maxDelta < delta){
				maxDelta = delta;
			}
			if(r < min){
				min = r;
				max = r;
			}else if(max < r){
				max = r;
				int benefit = max - min;
				if(maxBenefit < benefit){
					maxBenefit = benefit;
				}
			}
			old = r;
		}
		if(maxBenefit == 0){
			maxBenefit = maxDelta;
		}
		
		System.out.println(maxBenefit);
		
		
	}
	
}

