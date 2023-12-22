import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
        char n = br.readLine().charAt(0);
        pw.println((char)(((int)n)+1));pw.flush();
    }
}
