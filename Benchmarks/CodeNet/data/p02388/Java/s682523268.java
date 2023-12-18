import java.io.*;
class Main {
    public static void main(String argv[]) {
        int x;
        BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
	x= Integer.parseInt(d.readLine());
        x=x*x;
        System.out.println(x);
    }
}