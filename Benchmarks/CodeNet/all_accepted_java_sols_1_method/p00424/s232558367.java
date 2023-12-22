import java.util.*;
import java.io.*;

public class Main {

    public static void main (String args[]) {
        
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				int conv = Integer.parseInt(line);
				String type1 = "";
				String type2 = "";
				StringBuffer after = new StringBuffer(100);
				
				if (conv > 0) {
					for (int i = 0; i < conv; i++) {
						line = br.readLine();
						String[] str = line.split(" ");
						
						type1 += str[0];
						type2 += str[1];
					}
					
					line = br.readLine();
					conv = Integer.parseInt(line);

					for (int i = 0; i < conv; i++) {
						String target = br.readLine();
						int index = type1.indexOf(target);
						if (index != -1) {
							after.append(type2.substring(index, index + 1));
						}else {
							after.append(target);
						}						
					}
					
					System.out.println(after);
					
				}else if(conv == 0){
					System.exit(0);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			System.exit(0);
		}
    }
}