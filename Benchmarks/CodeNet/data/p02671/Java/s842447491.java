import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
	        String str = scanner.next(); //例：SSRSSSRR
	        String dances[] = new String[str.length()];
	        for (int i = 0; i < dances.length; i++) {
	          dances[i] = str.substring(i, i + 1);
	        }

	        // positionの初期値
	        Integer positions[] = new Integer[((int)Math.pow(3, N))];
	        for (int i = 0, len = positions.length; i < len; i++) {
	        	positions[i] = i;
	        }

	        for (String dance : dances) {
	        	Integer newPositions[] = new Integer[positions.length];
	        	if ("R".equals(dance)) {
	    	        for (int i = 0, len = positions.length; i < len; i++) {
	    	        	if (i == len - 1) {
	    	        		newPositions[0] = positions[i];
	    	        	} else {
		    	        	newPositions[i + 1] = positions[i];
	    	        	}
	    	        }
	        	} else {
	    	        for (int i = 0, len = positions.length; i < len; i++) {
	    	        	//int iPersonNum = positions[i];
	    	        	String sanShinsus[] = Integer.toString(i, 3).split("");
	    	        	for (int j = 0; j < sanShinsus.length; j++) {
	    	        		if ("1".equals(sanShinsus[j])) {
	    	        			sanShinsus[j] = "2";
	    	        		} else if ("2".equals(sanShinsus[j])) {
	    	        			sanShinsus[j] = "1";
	    	        		}
	    	        	}
	    	        	int newIPersonNum = Integer.parseInt(String.join("", sanShinsus), 3);
	    	        	newPositions[newIPersonNum] = positions[i];
	    	        }
	        	}
    	        positions = newPositions;
	        }
	        String result = "";
	        for (int i = 0, len = positions.length; i < len; i++) {
	        	result += " " + Arrays.asList(positions).indexOf(i);
	        }
	        result = result.substring(1);
	        System.out.print(result);
		}
	}
}