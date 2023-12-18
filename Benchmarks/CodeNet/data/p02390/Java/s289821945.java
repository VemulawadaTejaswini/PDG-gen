import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S=Integer.parseInt(br.readLine());
		int h=S/3600;
		int m=(S%3600)/60;
		int s=(S%3600)%60;
		System.out.print(h+":"+m+":"+s);
	}

}
