
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
 * @author shirakawa_d
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();
            System.out.println(getCubicOf(line));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * @param line
     *            ??´??°x?????\???
     * @return x???3???
     */
    private static long getCubicOf(String line) {
        long x = Long.parseLong(line);
        return (long)Math.pow(x, 3);
    }
}