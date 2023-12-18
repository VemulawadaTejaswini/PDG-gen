import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		while (true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			System.out.println(solve(n));
		}
	}
	
	static int[] tri;
	static int[] quad;
	static int[] minQuad;
	static int[] minQuad2;

	static void init(){
		tri = new int[1500];
		
		for(int i = 1; i < tri.length; i++){
			tri[i] = i*(i + 1)/2;
		}
		
		quad = new int[200];
		quad[1] = 1;
		for(int i = 2; i < quad.length; i++){
			quad[i] = quad[i - 1] + tri[i];
//			System.out.println("i = "+i+" quad "+quad[i]);
		}
		
		minQuad = new int[1000001];
		minQuad2 = new int[1000001];
		Arrays.fill(minQuad, Integer.MAX_VALUE);
		Arrays.fill(minQuad2, Integer.MAX_VALUE);
		
		minQuad[0] = 0;
		minQuad2[0] = 0;
		
		for(int i = 1; i < minQuad.length ; i++){
			for(int j = 1; j < quad.length; j++){
				if(quad[j] > i){
					break;
				}
				
				else if(quad[j] == i){
					minQuad[i] = 1;
				}
				else {
					minQuad[i] = Math.min(minQuad[i], minQuad[quad[j]]+minQuad[i-quad[j]]);
				}
			}
			
			for(int j = 1; j < quad.length; j++){
				if(quad[j] > i){
					break;
				}
				else if(quad[j]%2 == 0){
					continue;
				}
				else if(quad[j] == i){
					minQuad2[i] = 1;
				}
				else {
					minQuad2[i] = Math.min(minQuad2[i], minQuad2[quad[j]]+minQuad2[i-quad[j]]);
					
//					if(i == 20)System.out.println("j = "+j+" (quad[j]="+quad[j]+") "+minQuad2[quad[j]]+"+"+minQuad2[i-quad[j]]);
				}
			}
			
//			if(i < 100){
//				System.out.print(minQuad2[i]+" ");
//			}
		}
	}
	
	static String solve(int n){
		
		return minQuad[n]+" "+minQuad2[n];
	}
}
