import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int 	countMax;
		int[]		idata = new int[3];
		String[]	data;
		List<Boolean> list = new ArrayList<Boolean>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		countMax = Integer.parseInt(reader.readLine());
		for(int i = 0; i < countMax; i++){
			data = reader.readLine().split(" ");
			for(int j = 0; j < 3; j++) idata[j] = Integer.parseInt(data[j]);
			
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					if(idata[j] < idata[k]){
						int tmp = idata[j];
						idata[j] = idata[k];
						idata[k] = tmp;
					}
				}
			}
			list.add(((idata[2] * idata[2]) == (idata[0] * idata[0] + idata[1] * idata[1])));
		}
		
		for(Boolean bool : list)	System.out.println(bool.booleanValue() ? "YES" : "NO");

	}
}