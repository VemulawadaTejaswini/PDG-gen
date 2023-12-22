import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		int num;
		int[] a = new int[3];
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line," ");
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if(x-r < 0 || y-r < 0 || x+r >w || y+r > h){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}