import java.io.*;

class Main {
        public static void main (String[] args) throws IOException {
                BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
                String str = br.readLine ();
                double r = Double.parseDouble (str);
                double pi = 3.14159265359;
                System.out.println(pi * r * r + " " + 2 * pi * r);
        }
}