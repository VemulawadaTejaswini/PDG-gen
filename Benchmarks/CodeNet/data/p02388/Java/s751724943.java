import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = "";
            System.out.println(line);

            // ????????????????????´?????????

            while ((line = br.readLine()) != null) {
             processLine(line);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) throws IOException{
    	try{
    		int x = Integer.parseInt(line);
    		System.out.println(x * x * x);
    	}catch(NumberFormatException e){
    		throw new IOException(e);
    	}
    }
}