import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int toki,zikan,hun,byou;
		
		toki = Integer.parseInt(br.readLine());
		zikan = toki / 3600;
		hun = (toki % 3600)/60;
		byou = (toki % 3600) % 60;
		
		System.out.println(zikan+":"+hun+":"+byou);
	}
}