import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);
		int e = Integer.parseInt(str[4]);
		int f = Integer.parseInt(str[5]);
		
		double maxDensity = 0;
		int swMax = 0;
		int sugarMax = 0;
		for(int i = 0; 100*i*a <= f; i++){
			for(int j = 0; 100*(i*a+j*b) <= f; j++){
				int water = 100*(i*a+j*b);
				int sugarLimit = (i*a+j*b)*e;
				
				for(int k = 0; k*c <= sugarLimit && water + k*c <= f; k++){
					for(int l = 0; k*c + l*d <= sugarLimit && water + k*c + l*d <= f; l++){
						
						int sugar = k*c + l*d;
						double tmpDens = (double)sugar/(sugar+water);
						
						if(tmpDens > maxDensity){
							maxDensity = tmpDens;
							swMax = sugar+water;
							sugarMax = sugar;
						}
					}
				}
			}
		}
		
		if(sugarMax == 0){
			System.out.println(100*a + " " + sugarMax);
		}
		else {
			System.out.println(swMax + " " + sugarMax);
		}
	
	}
 
}
