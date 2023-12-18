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
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			List<Integer> sort = new ArrayList<Integer>();
			List<Integer> que = new ArrayList<Integer>();
			double box = Double.parseDouble(dst[0]);

			if(box == 0) break;

			int size = dst.length-1;
			int[] rad = new int[size];
			for(int i=0; i<size; i++){
				rad[i] = Integer.parseInt(dst[i+1]);
			}

			Arrays.sort(rad);

			for(int i=0; i<size-1; i++){
				que.add(rad[i]);
			}

			int flag = -1;
			double width = 0.0;
			sort.add(rad[size-1]);
			while(que.size() > 1){
				if(flag == 1){
					flag = -1;
					int num = que.size()-1;
					int r = que.get(num);
					que.remove(num);
					double wr = 2.0 * Math.sqrt(r * sort.get(0));
					double wl = 2.0 * Math.sqrt(r * sort.get(sort.size()-1));
					if(wr < wl){
						sort.add(0, r);
						width += wr;
					}else{
						sort.add(r);
						width += wl;
					}
				}
				else if(flag == -1){
					flag = 1;
					int num = 0;
					int r = que.get(num);
					que.remove(num);
					double wr = 2.0 * Math.sqrt(r * sort.get(0));
					double wl = 2.0 * Math.sqrt(r * sort.get(sort.size()-1));
					if(wr < wl){
						sort.add(r);
						width += wl;
					}else{
						sort.add(0, r);
						width += wr;
					}
				}
			}

			int r = que.get(0);
			double wr = r + 2.0 * Math.sqrt(r * sort.get(0)) + sort.get(sort.size()-1);
			double wl = sort.get(0) + 2.0 * Math.sqrt(sort.get(sort.size()-1) * r) + r;
			width += Math.min(wr, wl);

			if(width <= box){
				System.out.println("OK");
			}else{
				System.out.println("NA");
			}
		}
	}
}