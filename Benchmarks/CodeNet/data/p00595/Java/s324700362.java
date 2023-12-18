import java.io.*;

/**
 * ??´??°?????\??? "x" ????????????x???3????????????????????????
 * (1 ??? x ??? 100)
 * 
 * (ex)
 * 1 -> 1
 * 3 -> 27
 * 100 -> 1000000
 * 
 * @author dawkins_j
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = 0;
            int y = 0;
            String line = br.readLine();
            while(line != null) {
            	String[] list = line.split(" ", 0);
            	x = Integer.parseInt(list[0]);
            	y = Integer.parseInt(list[1]);
            	if (x < y){
                    int r = x;
                    x = y;
                    y = r;
                }
            }
			System.out.println(getCubicOf(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param line
     *            ??´??°x?????\???
     * @return x???3???
     */
    private static long getCubicOf(int x, int y) {
    	if(y == 0) {
            return x;
        }else{
            return getCubicOf(y, x % y);
        }
    }
}