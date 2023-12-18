import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String  str[] = new String[1];
		try{
		while(str !=null){

			str = br.readLine().split(" ");

			System.out.println(String.valueOf(Integer.parseInt(str[0])+Integer.parseInt(str[1])).length());

		}

	}catch(Exception e){
		System.exit(0);
	}


	}

}