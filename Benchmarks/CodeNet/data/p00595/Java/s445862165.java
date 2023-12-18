import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            System.out.println(findCommonDivisor(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findCommonDivisor(String line) {
    	String[] lineArray = line.split(" ", 0);
    	int x = Integer.parseInt(lineArray[0]);
    	int y = Integer.parseInt(lineArray[1]);

    	if(x < y) {
    		x = x + y;
        	y = x - y;
        	x = x - y;

    	}

    	while(y > 0) {
    		int r = x % y;
    		x = y;
    		y = r;

    	}

    	return x;
     }
}