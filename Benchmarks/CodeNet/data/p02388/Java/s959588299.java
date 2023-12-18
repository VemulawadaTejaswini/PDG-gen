import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            System.out.println(getFactorial(line));
            
   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long getFactorial(String line) {
    	long x = Integer.parseInt(line);
    	long y = (long) Math.pow(x,3);
		return y;
	}  
}