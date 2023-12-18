import java.io.*;

class Main4{
	public static void main (String[] args){
		int h, m, s;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			buf = br.readLine();
			h = Integer.parseInt(buf);
			buf = br.readLine();
			m = Integer.parseInt(buf);
			buf = br.readLine();
			s = Integer.parseInt(buf);
			System.out.println("S = "+ (3600*h+60*m+s));
			System.out.println("\n");
		} catch(Exception e){
		  }
	}
}