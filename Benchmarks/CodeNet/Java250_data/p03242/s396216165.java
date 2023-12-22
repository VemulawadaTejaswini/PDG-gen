import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  	/**
    *
    *
    */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int inputNum = Integer.parseInt(line);
		int Num_1 = Num_reverse(inputNum - (inputNum/10)*10);
		int Num_10 = Num_reverse(inputNum/10 - (inputNum/100)*10);
		int Num_100 = Num_reverse(inputNum/100);
		
		System.out.println(Num_1 + 10*Num_10 + 100*Num_100);
	}
	public static int Num_reverse(int num) {
		if(num == 1) {
			num = 9;
		} else if (num == 9) {
			num = 1;
		}
		return num;
	}
}