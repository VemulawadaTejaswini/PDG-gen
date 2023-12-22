import java.io.*;
class Main{
	public static void main (String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			String[] in = line.split(" ");
			if(in[1].equals("+"))
				System.out.println(Integer.parseInt(in[0]) + Integer.parseInt(in[2]));
			else if (in[1].equals("-"))
				System.out.println(Integer.parseInt(in[0]) - Integer.parseInt(in[2]));
			else if (in[1].equals("*"))
				System.out.println(Integer.parseInt(in[0]) * Integer.parseInt(in[2]));
			else if (in[1].equals("/"))
				System.out.println(Integer.parseInt(in[0]) / Integer.parseInt(in[2]));
			else break;
		}
	}
}