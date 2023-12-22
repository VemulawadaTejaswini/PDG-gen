import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input = br.readLine();
			if(input.equals("0 0")){
				break;
			}
			String[] numbers = input.split(" ");
			Integer max = Integer.parseInt(numbers[0]);
			Integer target = Integer.parseInt(numbers[1]);
			ArrayList<Integer[]> result = new ArrayList<Integer[]>();
			for(int i = 1; i <= max; i++){
				for(int j = 1; j <= max; j++){
					if(j != i){
						for(int k = 1; k <= max; k++){
							if(k != i && k != j){
								if(i + j + k == target){
									Integer[] comb = {i, j, k};
									Arrays.sort(comb);
									boolean is_contain = false;
									for(int l = 0; l< result.size(); l++){
										if(result.size() > 0 && Arrays.equals(result.get(l), comb)){
											is_contain = true;
										}
									}
									if(!is_contain){
										result.add(comb);
									}
								}
							}
						}
					}
				}
			}
			System.out.println(result.size());
		}
	}

}