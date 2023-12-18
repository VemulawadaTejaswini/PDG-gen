import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String have = br.readLine();
		int[][] card = new int[4][13];
		int exc = 0 ;
		String[] mark = {"S","H","C","D"};
		for(int i= 0 ; i < Integer.parseInt(have) ; i++){
			String str = br.readLine();
			String[] strc = str.split(" ");
			if("S".equals(strc[0])){
				exc =  Integer.parseInt(strc[1]);	
				card[0][exc-1] = exc ;
			} else if("H".equals(strc[0])){
				exc =  Integer.parseInt(strc[1]);	
				card[1][exc-1] = exc ;
			} else if("C".equals(strc[0])){
				exc =  Integer.parseInt(strc[1]);	
				card[2][exc-1] = exc ;
			} else if("D".equals(strc[0])){
				exc =  Integer.parseInt(strc[1]);	
				card[3][exc-1] = exc ;
			}
		}
		for(int j = 0 ; j < card.length ; j++){
			for (int k = 0 ; k < card[j].length ; k++){
				if(card[j][k] == 0 ){
					card[j][k] = k+1;
					System.out.println(mark[j] + " " + card[j][k]);
				}
			}
		}
	}

}