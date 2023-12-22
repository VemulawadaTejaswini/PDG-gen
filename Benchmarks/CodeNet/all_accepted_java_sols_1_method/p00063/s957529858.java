import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		String str = "";
		StringBuilder sb = new StringBuilder("");
		
		try{
			while((str = reader.readLine()) != null){
				sb.append(str);
				if(str.equals(sb.reverse().toString()))count++;
				sb.setLength(0);
			}
			System.out.println(count);
			
			reader.close();
		}catch(IOException e){
		}
	}
}