
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String result = "";
		for(int i = 0 ;  i<N ;i++){
			BigDecimal bd1 = new BigDecimal(br.readLine());
			BigDecimal bd2 = new BigDecimal(br.readLine());
			bd1 = bd1.add(bd2);
			if(bd1.toString().length() <= 80){
				result += bd1.toString()+"\n";
			}else{
				result += "overflow\n";
			}
		}
		System.out.print(result);
	}

}