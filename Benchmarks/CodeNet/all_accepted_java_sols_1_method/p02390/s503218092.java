import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
		String str=br.readLine();
		//String[] str = line.split(" ");
		int time=Integer.parseInt(str);
		int hour=time/3600;
		int min=(time-hour*3600)/60;
		int sec=time%60;
		System.out.println(hour+":"+min+":"+sec);
	}
}