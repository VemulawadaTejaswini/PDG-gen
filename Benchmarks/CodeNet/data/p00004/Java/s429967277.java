
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ="";
		while((line = br.readLine())!=null){
			String[] s= line.split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int d = Integer.parseInt(s[3]);
			int e = Integer.parseInt(s[4]);
			int f = Integer.parseInt(s[5]);
			int x = (e*c - b*f)/(a*e - b*d);
			int y = (a*f - c*d)/(a*e - b*d);
			System.out.println(x+" "+y);
		}

	}

}