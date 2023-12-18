import java.util.*;
import java.lang.*;
import java.io.*;								

public class Main{
	public static void main(String args[]){
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(rd);
		try{
				String str = br.readLine();
				String initial[] = str.split(" ");
				
				int number = Integer.parseInt(initial[0]);
				int legs = Integer.parseInt(initial[1]);
				float t = (float)legs/2-(float)number;
				float c = (float)number-t;
				
				if((c==0 && t==0)||c<0||t<0){
					System.out.println("No");
				}
				else if((c == Math.floor(c))&&(t==Math.floor(t))){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
				
		}
		catch(Exception e){
			return;
		}
	}
}