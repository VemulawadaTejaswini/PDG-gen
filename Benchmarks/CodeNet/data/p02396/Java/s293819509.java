import java.io.*;

class Main {
	public static void main(String[] args){
		int x, i;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringBuilder sb = new StringBuilder();
			buf = br.readLine();
			i = 1;
			while(true){
				x = Integer.parseInt(buf);
				if(x == 0)break;
				sb.append("Case "+i+": "+x+"\n");
				i++;
				}
				System.out.println(sb);
				
		} catch(Exception e){
		}
	}
}
		