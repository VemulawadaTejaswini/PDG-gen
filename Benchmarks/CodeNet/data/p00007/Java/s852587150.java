import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		double debt = 100.0; 
		for(int i = 0; i < n; i++){
			debt = debt * 1.05;
			int deb = (int)debt;
			double pre = debt;
			pre  = pre - (double)deb;
			if(pre != 0.0)
				deb++;
			debt = (double)deb;
		}
		
		
		int deb = (int)debt;
		deb *= 1000;
		System.out.println(deb);		
		
	}

}