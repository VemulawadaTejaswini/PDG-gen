
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<String> datas = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> result= new ArrayList<Integer>();

		
		
		while (true) {
			String s1 = new String(in.readLine());
			int target = Integer.parseInt(s1);
			int count=0;
			
			if(s1.equals("0")) break;
			
			int now = 0;
			
			for(int i =1; i<1000 ;i++){
				for(int j = 1;j<100;j++ ){
					now = (j*(2*i + j -1))/2;
					if(now == target && j != target && i != target){
						count++;
					}
					if(now>1000 || now>target) break;
				}
			}
			result.add(count);
			
		}
		
		for(int s : result){
			System.out.println(s);
		}
	}
}
