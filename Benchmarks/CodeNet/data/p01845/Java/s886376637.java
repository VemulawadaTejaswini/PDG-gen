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
			String[] tmpArray = br.readLine().split(" ");
			
			int r0 = Integer.parseInt(tmpArray[0]);
			int w = Integer.parseInt(tmpArray[1]);
			int c = Integer.parseInt(tmpArray[2]);
			int r = Integer.parseInt(tmpArray[3]);
			
			if(r0 == 0 && w == 0 && c == 0 && r == 0){
				break;
			}
			
			int newR = 0;
			for(int i = 0; i < Integer.MAX_VALUE ; i++){
				double currentDensity = (double)(r0 + i*r)/w;
//				System.out.println("dens "+currentDensity);
				if(currentDensity >= c){
					newR = i;
					break;
				}
			}
			
			System.out.println(newR);
		}
	}

}