import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReversingNumbers {
	  public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		String[] strArray = new String[num];
		String resultLine ="";
		
		
			BufferedReader sb =
					new BufferedReader(new InputStreamReader(System.in));
			
			String inputStr = sb.readLine();
			
			strArray = inputStr.split(" ");
			int[] inputNum = new int[num];
			
			for(int i=0; i<num; i++){
				inputNum[i] = Integer.parseInt(strArray[(num-1)-i]);
			}

			for(int j=0; j<num; j++) {
				resultLine = resultLine +inputNum[j] + " ";
			}
			String new_str1 = resultLine.trim();
			System.out.println(new_str1);
	}	
}