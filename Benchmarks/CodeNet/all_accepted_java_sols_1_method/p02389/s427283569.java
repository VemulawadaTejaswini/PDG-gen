import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

class Main {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s[] = br.readLine().split(" ", 2);
			int height = Integer.parseInt(s[0]);
			int width = Integer.parseInt(s[1]);	

			if(height < 1 || width> 100) {
				System.out.println("Err!");
				return;	
			}
			
			System.out.println(height*width + " " +  (height*2 + width*2));
			
		} catch (IOException e) {
			e.printStackTrace();			
		}
	}

}
