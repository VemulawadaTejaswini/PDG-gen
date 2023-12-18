import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] inStr= br.readLine().split(" ");
        int a = Integer.parseInt(inStr[0]);
        int b = Integer.parseInt(inStr[1]);
        double c = Integer.parseInt(inStr[2])*Math.PI/180;
        double h = b*Math.sin(c);
        double d = a - b*Math.cos(c);
        out.printf("%.4f\n",h*a/2);
        out.printf("%.4f\n",Math.sqrt(d*d + h*h)+a+b);
        out.printf("%.4f\n",h);
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}