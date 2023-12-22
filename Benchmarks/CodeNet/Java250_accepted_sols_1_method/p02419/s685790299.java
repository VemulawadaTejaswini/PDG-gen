import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int cnt = 0;
			while(true){
				String[] str = br.readLine().split(" ");
					if(str[0].equals("END_OF_TEXT")){
						break;
					}	
					for(int i = 0;i < str.length; i++){
					if(str[i].equalsIgnoreCase(x)) cnt += 1;	
				}
			}

		    System.out.println(cnt);
	}
}