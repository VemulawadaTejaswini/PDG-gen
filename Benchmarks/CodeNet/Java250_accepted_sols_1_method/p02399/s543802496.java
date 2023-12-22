import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int d = a / b;
        int r = a % b;
        String f = String.format("%.6f",(double) a / b);

        sb.append(d).append(" ").append(r).append(" ").append(f).append("\n");
        System.out.println(sb);
    }
}