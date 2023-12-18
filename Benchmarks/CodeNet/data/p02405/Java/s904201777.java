import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		 while(true){
			 String [] str = bufferedReader.readLine().split(" ");
			 Integer hInteger = Integer.parseInt(str[0]);
			 Integer wInteger = Integer.parseInt(str[1]);
			 
			 StringBuffer stringBuffer = new StringBuffer();
		 
			 if(hInteger == 0 && wInteger == 0){
				 break;
			 }
			 for(int i = 0; i < hInteger; i++){
				 for(int j = 0; j < wInteger; j++){
					 stringBuffer.append((i + j) % 2 == 0 ? "#" : ".");
					  }
				 stringBuffer.append("\n");
				 
			 }	 
			 System.out.println(stringBuffer);
		 }
		 
	}
}