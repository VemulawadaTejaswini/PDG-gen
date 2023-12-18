import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line;
			StringTokenizer st;
			StringBuilder sb = new StringBuilder();
			
			while(true){
				line = br.readLine();
				st = new StringTokenizer(line," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(x == 0 && y == 0){
					break;
				}
				else{
					sb.append(Integer.toString(x < y ? x : y)).append(" ").append(Integer.toString(x < y ? y : x)).append("\n");
				}
				System.out.print(sb);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}