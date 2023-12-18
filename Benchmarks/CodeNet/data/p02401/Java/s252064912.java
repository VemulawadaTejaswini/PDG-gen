import java.io.*;

class Main{
	static public void main (String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){
			String[] s;
			s = buf.readLine().split(" ");	
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[2]);

			if(s[1].equals("+"))
				sb.append(a+b+"\n");
			if(s[1].equals("-"))
				sb.append(a-b+"\n");
			if(s[1].equals("*"))
				sb.append(a*b+"\n");
			if(s[1].equals("/"))
				sb.append((float)a/b+"\n");
			if(s[1].equals("?"))
				break;
		}
		System.out.println(sb);

	}
}