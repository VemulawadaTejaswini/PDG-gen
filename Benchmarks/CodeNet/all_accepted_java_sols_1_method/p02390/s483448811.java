import java.io.*;
class Main{
	public static void main(String[] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String c = in.readLine();
			int time = Integer.parseInt(c);
			
			int h = time/3600;
			int m = (time%3600)/60;
			int s = time % 60;
			
			System.out.println(h+":"+m+":"+s);

		}catch(IOException e){
			e.printStackTrace();
		}

	}
}