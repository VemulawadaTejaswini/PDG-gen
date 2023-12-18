import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static final int MAX = 1000000;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int e = Integer.parseInt(br.readLine());
			
			if(e == 0){
				break;
			}
			
//			int m = e;
//			
//			
//			int z = 0;
//			for(int i = 2; i <= MAX && Math.pow(i, 3) <= e ; i++){
//				z = i;
//			}
//			
//			if(z != 0) e -= Math.pow(z, 3);
//			
//			int y = 0;
//			for(int i = 1; i <= MAX && Math.pow(i, 2) <= e ; i++){
//				y = i;
//			}
//			
//			if(y != 0) e -= Math.pow(y, 2);
//			
//			int x = 0;
//			for(int i = 1; i <= MAX && i <= e ; i++){
//				x = i;
//			}
//			
//			System.out.printf("x %d y %d z %d\n",x,y,z);
			System.out.println(numXYZ(e));
		}
	}
	
	static int numXYZ(int e){
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i <= MAX && e - Math.pow(i, 3) >= 0 ; i++){
//			if(e - (int)Math.pow(i, 3))
			int tmpmin = i + numXY(e - (int)Math.pow(i, 3)) ;
			
			if(min > tmpmin){
				min = tmpmin;
			}
		}
		
		return min;
	}
	
	static int numXY(int e){
		if(e < 0){
			return -1;
		}
		else if(e == 0){
			return 0;
		}
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i <= MAX && e - Math.pow(i, 2) >= 0 ; i++){
			int tmpmin = i + (e - (int)Math.pow(i, 2)) ;
			
			if(min > tmpmin){
				min = tmpmin;
			}
		}
//		System.out.println("min "+min);
		return min;
	}

}