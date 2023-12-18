import java.io.*;
 class watch
{
	public static void main(String args[])
	{
		int x;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String buf = br.readLine();
			x = Integer.parseInt(buf);
		}catch(Exception e){
			x = 0;
		}
		int h = x / 3600;
		int m = (x - (h * 3600)) / 60;
		int s = (x - (h * 3600) - (m * 60));
		System.out.println(h + ":" + m + ":" + s);
	}
}