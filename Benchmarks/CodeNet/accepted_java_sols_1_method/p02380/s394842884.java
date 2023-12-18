import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
        double a=Double.parseDouble(s[0]);
        double b=Double.parseDouble(s[1]);
        double C=Math.toRadians(Double.parseDouble(s[2]));
        double h=b*Math.sin(C);
        System.out.printf("%.8f%n", a*h/2);
        System.out.printf("%.8f%n", a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(C)));
        System.out.printf("%.8f%n", h);
	}
}