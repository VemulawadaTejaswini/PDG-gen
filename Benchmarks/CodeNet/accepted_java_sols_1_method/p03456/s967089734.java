/*
 * author Puneet;
 */
import java.io.*;

public class Main{
    public static void main(String agrs[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream, true);
        StringBuilder builder = new StringBuilder();

        String a[]=br.readLine().trim().split(" ");
        builder.append(a[0]);
        builder.append(a[1]);
//        out.println(builder);
        int n=Integer.parseInt(builder.toString());
        int p=(int)Math.sqrt(n);
        if((p*p)==n)
            out.println("Yes");
        else
            out.println("No");

    }

}
