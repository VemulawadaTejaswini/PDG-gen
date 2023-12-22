import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		String str;
		String[] dataSet;
		int dataSet_Number;
		double a,b,c,i;
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		dataSet_Number = Integer.parseInt(input.readLine());
		
		for(i = 0; i < dataSet_Number; i++){
			str = input.readLine();
			dataSet = str.split(" ");
			a = Math.pow(Double.parseDouble(dataSet[0]),2);
			b = Math.pow(Double.parseDouble(dataSet[1]),2);
			c = Math.pow(Double.parseDouble(dataSet[2]),2);
			
			if((a + b) == c || (b + c) == a || (a + c) == b){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}