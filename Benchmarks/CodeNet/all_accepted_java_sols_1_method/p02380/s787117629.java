import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    double a, b, C, c;
    double S, L, h;

    a = Double.parseDouble(str2[0]);
    b = Double.parseDouble(str2[1]);
    C = Double.parseDouble(str2[2]);
    c = Math.toRadians(C);

    S = a * b * Math.sin(c) * 1/2;
    L = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
    h = b * Math.sin (c);

    System.out.println(S);
    System.out.println(L + a + b);
    System.out.println(h);
  }
}
