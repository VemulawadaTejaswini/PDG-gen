import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String scond = br.readLine();
			int intscond = Integer.parseInt(scond);

			int h = intscond/3600;
			int m = (intscond%360)/60;
			int s = intscond%60;
			System.out.println(h+":"+m+":"+s);
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}



	}

}