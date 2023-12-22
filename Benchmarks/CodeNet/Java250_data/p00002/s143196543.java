import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	// main????????????
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(; ;){
			String oneline = br.readLine();
			if(oneline == null){
				break;
			}
			String[] line = oneline.split(" ");
			int data1 = Integer.parseInt(line[0]);
			int data2 = Integer.parseInt(line[1]);
			
			int digit = digitChk(data1, data2);
			
			System.out.println(digit);
		}
	}
	
	private static int digitChk(int a, int b){
		int sum = a+b;
		int digit = 0;	// digit
		
		for(; sum>0; digit++){
			sum /= 10;
		}
		
		return (digit);
	}

}