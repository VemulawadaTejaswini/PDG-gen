import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public static final int TARO=0;
	public static final int HANAKO=1;
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] inStr= br.readLine().split(" ");
        int x1=Integer.parseInt(inStr[0]);
        int y1=Integer.parseInt(inStr[1]);
        int x2=Integer.parseInt(inStr[2]);
        int y2=Integer.parseInt(inStr[3]);
        int dx = x2 - x1;
        int dy = y2 - y1;
        out.printf("%.4f",Math.sqrt(dx*dx + dy*dy));
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}