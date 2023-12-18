import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static double r = 6378.1;
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			String[] tmp = line.split(" ");
			
			double hp1 = 2.0 * Math.PI * Double.parseDouble(tmp[0]) / 360.0;
			double ep1 = 2.0 * Math.PI * Double.parseDouble(tmp[1]) / 360.0;
			double hp2 = 2.0 * Math.PI * Double.parseDouble(tmp[2]) / 360.0;
			double ep2 = 2.0 * Math.PI * Double.parseDouble(tmp[3]) / 360.0;
			
			if(hp1==-1.0 && ep1==-1.0 && hp2==-1.0 && ep2==-1.0) break;
			
			double cosd = Math.sin(hp1) * Math.sin(hp2) + Math.cos(hp1) * Math.cos(hp2) * Math.cos(ep1 - ep2);
			double dp = Math.acos(cosd);
			double dist = Math.abs(r * dp);
			
			System.out.println((int)(dist+0.5));
		}
	}
}