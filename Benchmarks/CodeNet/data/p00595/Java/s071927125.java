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
                while(x < y){
                    int r = x;
                    x = y;
                    y = r;
                    if(y == 0) {
                    	System.out.println(x);
                    }else{
                    	System.out.println(getCubicOf(x, y));
                }
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static long getCubicOf(int x, int y) {
            return getCubicOf(y, x % y);
    }
}