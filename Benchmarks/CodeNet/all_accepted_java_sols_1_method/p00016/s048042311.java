import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		double x=0.0, y = 0.0, kaku = 90.0/180*Math.PI; 			
		
		while(true){
			int n = 2;
			String c = br.readLine();
			if(c.equals("0,0"))
				break;
			double[] arr = new double[n];
			for(int i = 0; i < n; i++){
				if(c.indexOf(",") !=  -1){
					String str = c.substring(0, c.indexOf(","));
					arr[i] = Double.parseDouble(str);
					c = c.substring(c.indexOf(",") + 1);
				}
				else{
					arr[i] = Double.parseDouble(c);
				}
			}
			
			x += Math.cos(kaku)*arr[0];
			y += Math.sin(kaku)*arr[0];
			kaku -= arr[1]/180.0*Math.PI;
			
			

		}
		System.out.println((int)x);
		System.out.println((int)y);
		
	}

}