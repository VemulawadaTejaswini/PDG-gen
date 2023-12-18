import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{


	public static void main(String[] a){


        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);



        try {

			String nst = br.readLine();
			int n = Integer.parseInt(nst);

			for (int i = 0; i < n; i++) {
				String str = "";


				String strLn = br.readLine();
				str = strLn.replace("Hoshino", "Hoshina");

				System.out.println(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}