import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line = br.readLine()) != null) {
                String[] list = line.split(" ", 0);
                int x = Integer.parseInt(list[0]);
                int y = Integer.parseInt(list[1]);
                if(x < y){
                    int r = x;
                    x = y;
                    y = r;
                }
                long check = getCubicOf(x,y);
                System.out.println(check);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static long getCubicOf(int x, int y) {
    		while(y != 0) {
    			int r = x % y;
    			x = y;
    			y = r;
    		}
    		return x;
    }
}