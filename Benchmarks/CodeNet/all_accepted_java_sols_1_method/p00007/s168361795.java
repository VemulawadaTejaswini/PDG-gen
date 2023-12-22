import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();

            // ????????????????????´?????????
            // String line; // ??\???????????????????????\???
            // while ((line = br.readLine()) != null) {
            // processLine(line);
            // }
            
            double initialValue = 100000.0;

        	for( int i = 0 ; i < Integer.valueOf(line) ; i++ )
        	{
        	    double interest = initialValue * 0.05;
        	    initialValue = initialValue + interest;
        	    initialValue = initialValue / 1000;
        	    initialValue = Math.ceil(initialValue);
        	    initialValue = initialValue * 1000;
        	}
        	System.out.println((int)initialValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private static void processLine(String line) {
    // System.out.println(line);
    // }
}