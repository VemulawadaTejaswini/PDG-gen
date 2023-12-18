import java.io.*;

class Main4{
	public static void main (String[] args){
		int h, m, s;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			String buf1 = br.readLine();
			h = Integer.parseInt(buf1);
			String buf2 = br.readLine();
			m = Integer.parseInt(buf2);
			String buf3 = br.readLine();
			s = Integer.parseInt(buf3);
			System.out.println("S = "+ (3600*h+60*m+s));
		} catch(Exception e){
		  }
	}
}