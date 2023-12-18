import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
 
public class Main {
	public static final int TARO=0;
	public static final int HANAKO=1;
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[] strCA = br.readLine().toCharArray();
        int q = Integer.parseInt(br.readLine());
        for(int i=0; i<q; i++) {
        	String[] cmd = br.readLine().split(" ");
        	int arg1 = Integer.parseInt(cmd[1]);
        	int arg2 = Integer.parseInt(cmd[2]);
        	if("print".equals(cmd[0])) {
        		out.println(new String(strCA,arg1,arg2-arg1+1));
        	} else if("reverse".equals(cmd[0])) {
        		char[] arg3 = Arrays.copyOfRange(strCA,arg1,arg2+1);
        		for(int j=0; j<=arg2-arg1; j++) {
        			strCA[arg2-j] = arg3[j];
        		}
        	} else if("replace".equals(cmd[0])) {
        		char[] arg3 = cmd[3].toCharArray();
        		for(int j=0; j<=arg2-arg1; j++) {
        			strCA[arg1+j] = arg3[j];
        		}
        	}
        }
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}