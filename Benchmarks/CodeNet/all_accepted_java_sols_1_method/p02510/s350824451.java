import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String str;
		int m = -1;
		int i;
		int h;
		int l;
		try{
			while(true){
				str = reader.readLine();
				if(str.equals("-")){
					break;
				}
				l = str.length();
				line = reader.readLine();
				m = Integer.parseInt(line);
				for(i=0;i<m;i++){
					line = reader.readLine();
					h = Integer.parseInt(line);
					str = str.substring(h, l) + str.substring(0, h);
					//System.out.println("<"+str+">");
				}
				System.out.println(str);
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}