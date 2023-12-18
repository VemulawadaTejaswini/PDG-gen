import java.util.*;
import java.io.*;

class Main {
    public static void main (String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				
				if (str.length == 3) {
					int a = Integer.parseInt(str[0]);
					int b = Integer.parseInt(str[1]);
					int c = Integer.parseInt(str[2]);
					
					int a2 = a^2;
					int b2 = b^2;
					int c2 = c^2;
					
					if ((a2 + b2 == c2) || (b2 + c2 == a2) || (c2 + a2 == b2)) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}					
				}else if(str.length == 0){
					System.exit(0);
				}	
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			System.exit(0);
		}
    }
}