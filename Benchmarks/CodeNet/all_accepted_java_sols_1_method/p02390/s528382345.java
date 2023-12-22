import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long seconds = Long.parseLong(br.readLine());
        int h = (int) seconds/60/60;
        int m = (int) (seconds/60)%60;
        int s = (int) seconds%60;
        System.out.println(h + ":" + m + ":" + s);
    }
}