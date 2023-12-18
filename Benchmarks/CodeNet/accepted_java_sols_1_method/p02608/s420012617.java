import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int n = s.nextInt();
		 HashMap map = new HashMap();

		 int tmp = 0;
		 for(int x = 1; x < 100; x++) {
			 for(int y = 1; y < 100; y++) {
				 for(int z = 1; z < 100; z++) {
					 tmp = x*x + y*y + z*z + x*y + y*z + z*x;
					 if(tmp > n) {
						 break;
					 }
					 Integer val = (Integer)map.get(Integer.valueOf(tmp));
					 if(val == null) {
						 val = 1;
					 } else {
						 val++;
					 }
					 map.put(tmp, val);
				 }
			 }
		 }

		 for(int i = 1; i <= n; i++) {
			 Integer val = (Integer)map.get(Integer.valueOf(i));
			 if(val == null) {
				 val = 0;
			 }
			 System.out.println(val);
		 }
	}
}