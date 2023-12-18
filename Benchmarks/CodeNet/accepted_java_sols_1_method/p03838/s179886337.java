import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		for (String line; (line = tec.readLine()) != null;) {
			StringTokenizer st = new StringTokenizer(line);
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			long cont=0;
			if(a==b){
				out.println(0);
				continue;
			}
			if(a<b){
				if(a<0&&b>0){
					cont++;
				}
			}else{	
				
				if(b>0&&a>0){
					cont+=2;
				}
				if(b<=0&&a>=0){
					cont++;
				}
				if(b<0&&a<0){
					cont+=2;
				}
			}
			cont+=Math.abs(Math.abs(a)-Math.abs(b));
			out.println(cont);
		}
		out.close();
	}
}