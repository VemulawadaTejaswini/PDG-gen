import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int data = Integer.parseInt(reader.readLine());
		
		for(int i=1; i<=data; i++){
			if(i%3==0){
				builder.append(" ").append(Integer.toString(i));
				continue;
			}
			int x=i;
			do{
				if(x%10==3){
					builder.append(" ").append(Integer.toString(i));
					break;
				}
				x/=10;
			}while(x!=0);
		}
		
		System.out.println(builder);
		
	}
}