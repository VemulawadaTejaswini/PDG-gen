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
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0){
				break;
			}
			
			boolean know[][] = new boolean[n+1][n+1];
			for(int i = 1; i <= n; i++){
				String[] tmpArray = br.readLine().split(" ");
				
				for(int j = 1; j < tmpArray.length ; j++){
					int tmp = Integer.parseInt(tmpArray[j]);
					know[i][tmp] = true;
				}
			}
			
			String[] tmpArray = br.readLine().split(" ");
			int leak[] = new int[Integer.parseInt(tmpArray[0])];
			
			for(int i = 1; i < tmpArray.length ; i++){
				leak[i - 1] = Integer.parseInt(tmpArray[i]);
			}
			
			//?´???´?§£
			ArrayList<Integer> suspect = new ArrayList<Integer>();
			for(int i = 1; i <= n; i++){
				boolean black = true;
				for(int j = 0; j < leak.length ; j++){
					if(!know[i][leak[j]]){
						black = false;
						break;
					}
				}
				if(black){
					suspect.add(i);
				}
			}
			
			if(suspect.size() == 1){
				System.out.println(suspect.get(0));
			}
			else{
				System.out.println(-1);
			}
		}
	}

}