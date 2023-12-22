import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
    	int tmp = 0;
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        int S = Integer.parseInt(r.readLine());
        int s = S%60;
        tmp = S/60;
        int m = tmp%60;
        tmp = tmp/60;
        int h = tmp%60;
        System.out.println(h + ":" + m + ":" + s);
    }
}