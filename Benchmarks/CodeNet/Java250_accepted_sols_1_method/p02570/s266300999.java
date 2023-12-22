import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        double d = Double.parseDouble(str[0]);
        double t = Double.parseDouble(str[1]);
        double s = Double.parseDouble(str[2]);

        if ( (d/s) > t )
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
