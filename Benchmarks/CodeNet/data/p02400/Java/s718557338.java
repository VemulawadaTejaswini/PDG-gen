import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float r = Float.parseFloat(br.readLine());
        System.out.println((r*r*Math.PI) + " " + (2*r*Math.PI));
    }
}