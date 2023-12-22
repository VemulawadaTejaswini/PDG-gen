
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int init = 100000;
		for(int i = 0; i < n;i++){
			init = (int) ((int) init * 1.05);
			if(init%1000 != 0){
				init = ((init / 1000)+1) *1000;
			}
		}
		System.out.println(init);
		
	}

}