import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        br.readLine(); br.readLine(); br.readLine();
        int e = Integer.parseInt(br.readLine());
        int k= Integer.parseInt(br.readLine());
        if(e-a<=k) bw.write("Yay!");
        else bw.write(":(");
        bw.close();

    }
}
