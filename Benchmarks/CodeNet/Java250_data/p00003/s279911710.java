
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		try {
			int a;
			int b;
			int c;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = new String(reader.readLine());
			int setsu = Integer.parseInt(s);
			for(int i=1;i<=setsu;i++){
				String Tri = new String(reader.readLine());
				String[] result1 = Tri.split(" ");
				a = Integer.parseInt(result1[0]);
				b = Integer.parseInt(result1[1]);
				c = Integer.parseInt(result1[2]);
				if(((a*a)+(b*b)==(c*c))||((c*c)+(b*b)==(a*a))||((a*a)+(c*c)==(b*b)))
				{
					System.out.println("YES");
				}else
				{
					System.out.println("NO");
				}

			}

		} catch (IOException e) {

		}
	}

}