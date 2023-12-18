import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{

		 InputStreamReader in = new InputStreamReader(System.in);
		 BufferedReader read = new BufferedReader(in);

		 String line = read.readLine();
		 String [] spli = line.split(" ");
		 double x1 = Double.parseDouble(spli[0]);
		 double y1 = Double.parseDouble(spli[1]);
		 double x2 = Double.parseDouble(spli[2]);
		 double y2 = Double.parseDouble(spli[3]);
		 double root;

		 root = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		 System.out.println(Math.sqrt(root));
	}
}

