import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


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
		
//		String[] ID = new String[n];
		ArrayList<String> ID = new ArrayList<String>();
		
		for(int i = 0; i < n; i++){
			ID.add(br.readLine());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		boolean lock = true;
		
		for(int i = 0; i < m; i++){
			String str = br.readLine();
			
			if(ID.contains(str)){
				if(lock){
					System.out.println("Opened by "+str);
				}
				else{
					System.out.println("Closed by "+str);
				}
				
				lock = !lock;
			}
			
			else {
				System.out.println("Unknown "+str);
			}
		}
	}

}