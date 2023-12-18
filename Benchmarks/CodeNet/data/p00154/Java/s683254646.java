import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size==0) break;
			int[][] data = new int[size][2];
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				data[n][0] = Integer.parseInt(tmp[0]);
				data[n][1] = Integer.parseInt(tmp[1]);
			}
			
			line = in.readLine();
			size = Integer.parseInt(line);
			for(int n=0; n<size; n++){
				line = in.readLine();
				int num = Integer.parseInt(line);
				int[] N = {0};
				count(data, num, N, 0, 0);
				System.out.println(N[0]);
			}
		}
	}
	
	public void count(int[][] data, int ans, int[] N, int current, int depth){
		if(depth != data.length){
			for(int n=0; n<=data[depth][1]; n++){
				int cost = current + data[depth][0] * n;
				count(data, ans, N, cost, depth+1);
			}
		}
		else{
			if(current == ans){
				N[0]++;
			}
		}
	}
}