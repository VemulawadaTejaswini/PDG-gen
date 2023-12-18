import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		char chr ;

		for(int i=0; i<str.length(); i++){

			chr = str.charAt(i);
			if(Character.isLowerCase(chr)){
				System.out.print(Character.toUpperCase(chr)+" ");
			}else {
				System.out.print(Character.toLowerCase(chr)+" ");
			}
		}

	}
}