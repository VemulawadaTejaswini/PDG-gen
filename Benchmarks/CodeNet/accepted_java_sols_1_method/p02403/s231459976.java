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
			int b= Integer.parseInt(data[1]);
			
			if(a==0 && b==0)
				break;
			
			for(int y=0; y<a; y++){
				for(int x=0; x<b; x++){
					builder.append("#");
				}
				builder.append("\n");
			}
			builder.append("\n");
		
		}
		System.out.print(builder);
	}
}