import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		while(br.ready()){
			line= br.readLine();
		}
		String[] abc = line.split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
		
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}