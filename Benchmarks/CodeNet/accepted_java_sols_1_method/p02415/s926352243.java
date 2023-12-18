import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		char chr ;

		StringBuilder build = new StringBuilder();

		for(int i=0; i<str.length(); i++){

			chr = str.charAt(i);
			if(Character.isLowerCase(chr)){
				build.append(Character.toUpperCase(chr));
			}else {
				build.append(Character.toLowerCase(chr));

			}
		}


		System.out.print(build.toString()+"\n");

	}
}