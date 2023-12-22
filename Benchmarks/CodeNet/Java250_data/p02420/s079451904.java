import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		ArrayList<String> dis = new ArrayList<String>();
		while(true){
			str = br.readLine();
			if(str.equals("-")) break;
			int h = Integer.parseInt(br.readLine());
			for(int i=0 ;i<h ;i++){
				int c = Integer.parseInt(br.readLine());
				sb.append(str);
				str = sb.substring(0,c);
				sb.delete(0,c);
				str = sb.append(str).toString();
				sb.setLength(0);
			}
			dis.add(str);
		}
		for(String s : dis){
			System.out.println(s);
		}
	}
}