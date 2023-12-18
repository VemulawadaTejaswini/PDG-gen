import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] lengths = str.split(" ");
        System.out.println(lengths[0]*lengths[1] + " " + 2*(lengths[0]+lengths[1]));
    }
}