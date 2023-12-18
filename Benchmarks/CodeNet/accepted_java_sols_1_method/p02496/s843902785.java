import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c[][] = new int[4][13];
		String m[] = {"S","H","C","D"};
		int n,y,z=0;
		String x;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		for(int i=0; i<n; i++){
			x = s.next();
			y = s.nextInt() - 1;
			if(x.equals("S")) z = 0;
			else if(x.equals("H")) z = 1;
			else if(x.equals("C")) z = 2;
			else if(x.equals("D")) z = 3;
			c[z][y] = 1;
					
		}
		
		for(int i=0; i<4; i++){
			for(int k=0; k<13; k++){
				if(c[i][k] == 0){
					System.out.println(m[i] + " " + (k+1));
				}
			}
			
		}
		
	}

}