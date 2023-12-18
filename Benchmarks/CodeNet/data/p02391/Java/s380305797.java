import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringTokenizer st = new StringTokenizer(str, " ");

		  int x  = Integer.parseInt(st.nextToken());
		  int y  = Integer.parseInt(st.nextToken());

		  if(x < y) {
			  System.out.println("x < y");
		  }else if (x > y){
			  System.out.println("x > y");
		  }else if (x == y) {
			  System.out.println("x == y");
		  }


	}

}