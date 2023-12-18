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
			
			if(input == null){
				break;
			}
			
			int numOfJOI = 0;
			int numOfIOI = 0;
			
			for(int i = 0; i < input.length() - 2; i++){
				String sub = input.substring(i, i+3);
				if(sub.equals("JOI")){
					numOfJOI++;
				}
				else if(sub.equals("IOI")){
					numOfIOI++;
				}
			}
			
			System.out.println(numOfJOI);
			System.out.println(numOfIOI);
			
		}
	}

}