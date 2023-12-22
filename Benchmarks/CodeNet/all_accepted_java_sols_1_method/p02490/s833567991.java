import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));

		
		for(;;) {
			String str = input.readLine();
			String array[] = str.split(" ");
			int[] x = new int[array.length];
			
			for(int i = 0; i<array.length; i++) {
				x[i] = Integer.parseInt(array[i]);
			} 
			
			if(x[0] == 0 && x[1] == 0) {
				break;
			}
			else {
				if(x[0]>x[1]) {
					int a = x[0];
					x[0] = x[1];
					x[1] = a;
				}
				System.out.println(x[0]+" "+x[1]);
			}	
		}
	}
}