import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String[]> ans = new ArrayList<String[]>();

		String line;
		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			double h = Double.parseDouble(dst[0]);
			double w = Double.parseDouble(dst[1]);
			double d = Double.parseDouble(dst[2]);
			double R = 0.0;

			if(h == 0.0 && w == 0.0 && d == 0.0){
				break;
			}

			if(h > w){
				R += w*w;
				if(h > d){
					R += d*d;
				}else{
					R += h*h;
				}
			}else{
				R += h*h;
				if(w > d){
					R += d*d;
				}else{
					R += w*w;
				}
			}

			R = Math.sqrt(R);

			line = in.readLine();
			int data_size = Integer.parseInt(line);
			String[] res = new String[data_size];

			for(int i=0; i<data_size; i++){
				line = in.readLine();
				double hall_size = Double.parseDouble(line);

				if(R < 2.0 * hall_size){
					res[i] = "OK";
				}else{
					res[i] = "NA";
				}
			}
			ans.add(res);
		}

		for(int i=0; i<ans.size(); i++){
			String[] dst = ans.get(i);
			for(int j=0; j<dst.length; j++){
				System.out.println(dst[j]);
			}
		}
	}
}