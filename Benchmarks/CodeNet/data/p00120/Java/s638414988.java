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
		ArrayList<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			double size = Double.parseDouble(dst[0]);

			//if(size == 0.0) break;
			int[] radius = new int[dst.length-1];
			int[] seq = new int[dst.length-1];
			for(int i=1; i<dst.length; i++){
				radius[i-1] = Integer.parseInt(dst[i]);
			}

			for(int i=0; i<radius.length/2; i++){
				seq[i*2] = i;
				seq[i*2+1] = radius.length-1-i;
			}
			if(radius.length%2 == 1){
				seq[radius.length-1] = radius.length/2;
			}

			Arrays.sort(radius);
			double cakes = calcSize(radius, seq);

			if(cakes > size){
				Ans.add("NA");
			}
			else{
				Ans.add("OK");
			}
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public double calcSize(int[] data, int[] seq){
		double sum = 0.0;
		sum += (double)(data[seq[0]] + data[seq[data.length-1]]);
		for(int i=0; i<data.length-1; i++){
			sum += 2.0 * Math.sqrt(data[seq[i]] * data[seq[i+1]]);
		}
		return sum;
	}
}