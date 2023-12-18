import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        {
            String strArr= br.readLine();
            double a=Double.parseDouble(strArr);
            double pi=3.14159265358979323846264338327950288419716939937510582;

            String men=String.format("%.5f",a*a*pi);
            String syu=String.format("%.5f",a*2*pi);
            System.out.println(men+" "+syu);
        }
    }
}