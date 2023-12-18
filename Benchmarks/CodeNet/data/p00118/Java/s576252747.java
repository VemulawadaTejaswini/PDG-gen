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
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(h==0 && w==0){
				break;
			}

			String[][] data = new String[h+1][w+1];
			for(int j=1; j<=h; j++){
				line = in.readLine();
				for(int i=1; i<=w; i++){
					data[j][i] = line.substring(i-1, i);
				}
			}

			for(int j=0; j<=h; j++){
				data[j][0] = " ";
			}

			for(int i=0; i<=w; i++){
				data[0][i] = " ";
			}

			int count = 0;
			String prev = "";
			for(int j=1; j<=h; j++){
				for(int i=1; i<=w; i++){
					if(!data[j][i].equals(prev)){
						prev = "";
					}

					if(!data[j][i].equals(data[j-1][i]) && !data[j][i].equals(data[j][i-1])){
						count++;
					}

					else if(data[j][i].equals(data[j-1][i]) && data[j][i].equals(data[j][i-1]) && !data[j][i].equals(data[j-1][i-1])){
						if(prev.equals("")){
							count--;
						}
					}

					else if(data[j][i].equals(data[j-1][i])){
						prev = data[j][i];
					}
				}
			}

			Ans.add(count);
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}import java.io.*;
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
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(h==0 && w==0){
				break;
			}

			String[][] data = new String[h+1][w+1];
			for(int j=1; j<=h; j++){
				line = in.readLine();
				for(int i=1; i<=w; i++){
					data[j][i] = line.substring(i-1, i);
				}
			}

			for(int j=0; j<=h; j++){
				data[j][0] = " ";
			}

			for(int i=0; i<=w; i++){
				data[0][i] = " ";
			}

			int count = 0;
			String prev = "";
			for(int j=1; j<=h; j++){
				for(int i=1; i<=w; i++){
					if(!data[j][i].equals(prev)){
						prev = "";
					}

					if(!data[j][i].equals(data[j-1][i]) && !data[j][i].equals(data[j][i-1])){
						count++;
					}

					else if(data[j][i].equals(data[j-1][i]) && data[j][i].equals(data[j][i-1]) && !data[j][i].equals(data[j-1][i-1])){
						if(prev.equals("")){
							count--;
						}
					}

					else if(data[j][i].equals(data[j-1][i])){
						prev = data[j][i];
					}
				}
			}

			Ans.add(count);
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}