import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String target = br.readLine();
		int count = 0;
		while(!(str = br.readLine()).equals("END_OF_TEXT")){
			String [] strArray = str.split(" ");
			for(String s : strArray){
				if(s.equals(target)){
					count++;
				}
			}
		}
		System.out.println(count);
    }
}