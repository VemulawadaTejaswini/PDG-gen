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
			int c = Integer.parseInt(st.nextToken());
			if(a < b){
				if(b < c){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
			else{
				System.out.println("No");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}