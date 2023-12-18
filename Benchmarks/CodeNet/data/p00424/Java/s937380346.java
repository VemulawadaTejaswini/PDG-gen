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
				
				String after = "";
				
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
						System.out.println(target);
						int index = type1.indexOf(target);
						System.out.println(index);
						if (index != -1) {
							after += type2.substring(index, index + 1);
							System.out.println(after);
						}else {
							after += target;
							System.out.println(after);
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