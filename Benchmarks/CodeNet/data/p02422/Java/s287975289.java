import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = buf.readLine();
		String[] s;
		int q = Integer.parseInt(buf.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<q; i++){
			s = buf.readLine().split(" ");
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			if(s[0].equals("replace"))
				str = str.replace(str.substring(a,b+1),s[3]);
			if(s[0].equals("reverse")){
				sb.append(str.substring(a,b+1));
				String x = sb.reverse().toString();
				sb.setLength(0);
				sb.append(str);			
				sb.replace(a,b+1,x);
				str = sb.toString();
				sb.setLength(0);

			}
			if(s[0].equals("print")){
				System.out.println(str.substring(a,b+1));
			}
		}	
		//System.out.println(str);
			
	}
}