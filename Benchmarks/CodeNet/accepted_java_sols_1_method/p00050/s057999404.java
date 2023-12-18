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

		String input = br.readLine();
		String[] splitByApple = input.split("apple",-1);
		
		for(int i = 0; i < splitByApple.length ; i++){
			splitByApple[i] = splitByApple[i].replaceAll("peach", "apple");
		}
		
		for(int i = 0; i < splitByApple.length ; i++){
			if(i != 0){
				System.out.print("peach");
			}
			System.out.print(splitByApple[i]);
		}
		
		System.out.println();
	}

}