import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			int n = Integer.parseInt(str);
			
			System.out.println(AreaDivider.maximumAreaNum(n));
		}
	}

}

class AreaDivider{
	static long maximumAreaNum(int n){
		long result = 2;
		
		for(int i = 2; i <= n; i++){
			result += i;
		}
		
		return result;
	}
}