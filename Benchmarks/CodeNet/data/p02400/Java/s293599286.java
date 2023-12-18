import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float r = Float.parseFloat(br.readLine());
        System.out.println((Math.PI * r * r) + " " + (2 * Math.PI * r));
    }
}