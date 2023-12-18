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
		
		int max = list.get(0);
		int min = max;
		int min2 = min;
		int maxBenefit = 0;
		
		for(int r: list){
			if(r < min){
				min2 = min;
				min = r;
				max = r;
			}else if(max < r){
				max = r;
				int benefit = max - min;
				if(maxBenefit < benefit){
					maxBenefit = benefit;
				}
			}
		}
		if(maxBenefit == 0){
			maxBenefit = min - min2;
		}
		
		System.out.println(maxBenefit);
		
		
	}
	
}

