

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long num = s.nextLong();
		long mul = 1;
		ArrayList<Long> inputs = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			inputs.add(s.nextLong());
		}
		
		Collections.sort(inputs);
					
		if (inputs.get(0) == 0) {
			    System.out.println(0);
			    System.exit(0);
		
		}
		
		for(long l:inputs) {
			
			mul *= l;
			
            if (mul < l) {
    			System.out.println(-1);
    			System.exit(0);
            }	
		}
		

		if (mul > 1000000000000000000L) {
			System.out.println(-1);
		}

		else {
			System.out.println(mul);
		}
		

	}

}
