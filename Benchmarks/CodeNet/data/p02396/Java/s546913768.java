import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            int cases = Integer.parseInt(line);
        	for(int i = 1; i < 10001; i++){
        		System.out.println("Case " + i + ": " + cases);
        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}