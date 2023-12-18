import java.io.BufferedReader;

import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            
            System.out.println(getCubeOf(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getCubeOf(String line) {
    	int x = Integer.parseInt(line);
    	return (int)Math.pow(x, 3);
    }
}