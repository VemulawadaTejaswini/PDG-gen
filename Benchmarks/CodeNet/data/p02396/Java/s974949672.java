import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args){

		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int j=1;j<1000;j++){
			
		
		try {str = br.readLine();} 
		
		catch (IOException e) {e.printStackTrace();}
		
		int i = Integer.parseInt(str);
		
		if(0==i){
			break;
			}else{
		System.out.println("Case "+ j +": "+i);
		}
		}
		
		
		}
}