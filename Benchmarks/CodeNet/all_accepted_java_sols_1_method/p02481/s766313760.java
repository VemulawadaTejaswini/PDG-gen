import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strTateYoko = br.readLine();
		String[] tateYoko = strTateYoko.split(" ");
		Integer tate = Integer.parseInt(tateYoko[0]);
		Integer yoko = Integer.parseInt(tateYoko[1]);
		System.out.println(tate*yoko + " " + (tate*2+yoko*2));
	}

}