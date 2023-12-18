import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(br.readLine());
        double sA =(double) r * r * Math.PI;
        double cF =(double) 2 * r * Math.PI;

        sb.append(sA).append(" ").append(cF).append("\n");
        System.out.println(sb);

    }
}