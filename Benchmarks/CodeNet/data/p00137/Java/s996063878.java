import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line = in.readLine();
		int size = Integer.parseInt(line);
		
		for(int n=0; n<size; n++){
			Ans.add("Case " + Integer.toString(n+1) + ":");
			
			line = in.readLine();
			int s = Integer.parseInt(line);
			
			for(int m=0; m<10; m++){
				s = nextNum(s);
				Ans.add(Integer.toString(s));
			}
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
	
	public int nextNum(int s){
		s = s * s;
		String dst = Integer.toString(s);
		int a = 8 - dst.length();
		for(int n=0; n<a; n++){
			dst = "0" + dst;
		}
		
		dst = dst.substring(2, 6);
		return Integer.parseInt(dst);
	}
}