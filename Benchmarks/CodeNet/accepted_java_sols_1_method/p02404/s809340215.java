import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;

		while(true){
			StringBuilder sb = new StringBuilder();
			String[] str = in.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if(H==0&&W==0)break;
			if(300<H||300<W)throw new RuntimeException("range over");
			for(int i=1; i<=H;i+=1){
				for(int j=1; j<=W; j+=1){
					if((2<=i && i<H)&&(2<=j&&j<W)){
						sb.append(".");
					}else {
						sb.append("#");
					}
				}
				sb.append(System.getProperty("line.separator"));
			}
			out.println(sb);
		}
	}
}