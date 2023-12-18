import java.io.*;
class Main4{
	public static void main (String[] args){
		int S,h,m,s;
			String buf;
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			buf = br.readLine();
			
			S = Integer.parseInt(buf);
			h = S/3600;
			m = (S % 3600)/60;
			s = (S % 3600) % 60;
			System.out.print("h =" + h + "m = " + m + "n = " + s);
		  	System.out.print("\n");
		  } catch (Exception e){
		  }
	}
}