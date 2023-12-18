import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) {
        
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				int count = Integer.parseInt(line);
				
				int sum1 = 0;
				int sum2 = 0;
				
				if (count > 0) {
					for (int i = 0; i < count; i++) {
						line = br.readLine();
						String[] str = line.split(" ");
						
						int a = Integer.parseInt(str[0]);
						int b = Integer.parseInt(str[1]);
						
						if (a > b) {
							sum1 += a + b;
						}else if (b > a) {
							sum2 += a + b;
						}else {
							sum1 += a;
							sum2 += b;
						}						
					}
					
					System.out.println(sum1 + " " + sum2);
					
				}else {
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