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
			int dist = Integer.parseInt(tmpArray[0]);
			int est = Integer.parseInt(tmpArray[1]);
			
			if(dist == 0 && est == 0){
				break;
			}
			
			double diff = Integer.MAX_VALUE;
			for(int x = 0; x <= dist ; x++){
				double cost = Math.sqrt(x*x + (dist-x)*(dist-x));
//				System.out.println(cost);
				if(diff > Math.abs(est - cost)){
					diff = Math.abs(est - cost);
				}
			}
			
			System.out.println(diff);
		}
	}

}