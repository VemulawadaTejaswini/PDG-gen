import java.util.*;
import java.math.BigDecimal;
public class Main {

  
	public static void main(String[] args) {
      
      	Main main = new Main();
      	main.run();
    }
  
  	void run() {
    	Scanner sc = new Scanner(System.in);
      
      	int line = sc.nextInt();
		String dumy = sc.nextLine();
      
      	int val[][] = new int[line][2];
      
      	for (int i = 0; i < line; i++) {
        	String []str = sc.nextLine().split(" ");
			val[i][0] = Integer.parseInt(str[0]);
			val[i][1] = Integer.parseInt(str[1]);
        }
      
      	HashMap r = new HashMap();
      	for (int i = 0; i < line; i++) {
          for (int j = 0; j < line; j++) {
			String key = String.valueOf((val[i][0] + val[j][1]) / 2.0f);
            r.put(key, "OK");
          }
        }
      
      	System.out.println(r.size());
      
    }      
  
}