import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{

			while(true){
				String[] s = br.readLine().split(" ");

				if(s==null){break;}

				int a = Integer.valueOf(s[0]);
				int b = Integer.valueOf(s[1]);

				if((a==0&&b==0)||(b==0)){break;}

				int d = a/b;
				int r = a%b;
				float f = (float)a/b;

				System.out.println(d + " " + r + " " + f);
			}

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}