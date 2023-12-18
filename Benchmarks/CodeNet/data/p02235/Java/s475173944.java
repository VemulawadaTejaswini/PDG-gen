import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			//System.out.println(LCSReccursive(str1, str2));
			System.out.println(LCSDP(str1, str2));
		}
	}
	static int LCSDP(String str1, String str2){
		int[][] DPResult = new int[str1.length()+1][str2.length()+1];
		
		for(int i = 0 ; i <= str1.length() ; i++){
			Arrays.fill(DPResult[i], 0);
		}
		
		for(int i = 1; i <= str1.length() ; i++){
			for(int j = 1; j <= str2.length() ; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					DPResult[i][j] = DPResult[i-1][j-1] + 1;
				}
				else if(DPResult[i-1][j] >= DPResult[i][j-1]){
					DPResult[i][j] = DPResult[i-1][j];
				}
				else {
					DPResult[i][j] = DPResult[i][j-1];
				}
				
				//System.out.print(DPResult[i][j] + " ");
			}
			//System.out.println();
		}
		
		
		
		
		return DPResult[str1.length()][str2.length()];
		
	}
	
	static int LCSReccursive(String str1, String str2){
		//System.out.println("compare "+str1+" and "+str2);
		if(str1.length() == 0 || str2.length() == 0){
			return 0;
		}
		else if (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)){
			return LCSReccursive(str1.substring(0, str1.length() - 1), str2.substring(0, str2.length() - 1)) + 1;
		}
		else {
			return Math.max(LCSReccursive(str1, str2.substring(0, str2.length() - 1)), LCSReccursive(str1.substring(0, str1.length() - 1), str2));
		}
	}

}