import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	  public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		String resultLine ="";
		
			
			String[] inputStr = br.readLine().split(" ");
			String[] inputNum = new String[num];
			
			for(int i=0; i<num; i++){
				inputNum[i] = (inputStr[(num-1)-i]);
			}

			for(int j=0; j<num; j++) {
				resultLine = resultLine +inputNum[j] + " ";
			}
			String new_str1 = resultLine.trim();
			System.out.println(new_str1);
	}	
}