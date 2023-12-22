import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		while(true){
			String data[] = reader.readLine().split(" ");
			int a= Integer.parseInt(data[0]);
			int b= Integer.parseInt(data[2]);
			
			if( data[1].equals("+") )
				builder.append(Integer.toString(a+b)).append("\n");
			else if( data[1].equals("-") )
				builder.append(Integer.toString(a-b)).append("\n");
			else if( data[1].equals("*") )
				builder.append(Integer.toString(a*b)).append("\n");
			else if( data[1].equals("/") )	
				builder.append(Integer.toString(a/b)).append("\n");
			else if( data[1].equals("?") )
				break;
		}
		System.out.print(builder);
	}
}