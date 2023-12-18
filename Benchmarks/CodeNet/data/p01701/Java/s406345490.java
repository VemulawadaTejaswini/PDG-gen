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
			String input = br.readLine();
			
			if(input.equals("#")){
				break;
			}
			
			String result = solve(input);
			
			System.out.println(result);
		}
	}
	
	public static String solve(String str){
		str = str.replaceAll("north", "n");
		str = str.replaceAll("west", "w");
		
//		System.out.println(str);
		
		int numer;
		if(str.charAt(str.length()-1) == 'n'){
			numer = 0;
		}
		
		else {
			numer = 90;
		}
		int denomi = 1;
		for(int i = str.length() - 2; i >= 0 ; i--){
			numer *= 2;
			denomi *= 2;
			
			if(str.charAt(i)=='n'){
				if(numer != 0){
					numer -= 90;
				}
			}
			else {
				if(numer != denomi*90){
					numer += 90;
				}
			}
			
			
			
//			System.out.println("current angle "+numer+"/"+denomi);
		}
		
		//?´????
		while(denomi > 1){
			if(numer % 2 == 0){
				numer /= 2;
				denomi /= 2;
			}
			else {
				break;
			}
		}
		
		if(denomi == 1){
			return ""+numer;
		}
		String result = numer+"/"+denomi;
		return result;
	}

}