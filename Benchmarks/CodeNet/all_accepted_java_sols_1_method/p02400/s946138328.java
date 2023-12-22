import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");

        Double a = Double.parseDouble(num2[0]);

        double s = a * a * Math.PI;
        double l = (a + a) * Math.PI;
        String S = String.format("%.6f", s);
        String L = String.format("%.6f", l);

        System.out.println(S + " " + L);
    }
}