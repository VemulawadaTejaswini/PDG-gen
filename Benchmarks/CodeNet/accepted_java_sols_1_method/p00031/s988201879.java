
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ="";
		int array[] = {512,256,128,64,32,16,8,4,2,1};
		
		while((line = br.readLine())!=null){
			int n = Integer.parseInt(line);
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < array.length;i++){
				if(n >= array[i]){
					n = n-array[i];
					list.add(array[i]);
				}
			}
			Collections.reverse(list);
			for(int i = 0; i < list.size();i++){
				System.out.print(list.get(i));
				if(i!=list.size()-1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}