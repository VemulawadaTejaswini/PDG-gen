import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] map = {"A","B","C"};
		int[] point = new int[3];
		point[0]++;
		String check;
		while((check = sc.readLine()) != null){
			String[] lo = check.split(",");
			int temp;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(lo[0].equals(map[i]) & lo[1].equals(map[j])){
						temp = point[i];
						point[i] = point[j];
						point[j] = temp;
					}
				}
			}

		}
		for(int i = 0; i < 3; i++){
			if(point[i] != 0) System.out.println(map[i]);
		}
	}
}