import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a < b){
				System.out.println("a < b");
			}
			else if(a > b){
				System.out.println("a > b");
			}
			else if(a == b){
				System.out.println("a == b");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}