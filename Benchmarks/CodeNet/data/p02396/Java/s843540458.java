import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            int cases = Integer.parseInt(line);
            int i = 0;
        	for(i = 0; i < 10000; i++){
        		System.out.println("Case " + i + ": " + cases);
        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}