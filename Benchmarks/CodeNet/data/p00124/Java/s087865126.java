import java.io.*;
import java.util.*;

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
		List<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);

			if(size == 0) break;

			List<String> teams = new ArrayList<String>();
			List<Integer> scores = new ArrayList<Integer>();
			int[] sdst = new int[size];
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] dst = line.split(" ");
				teams.add(dst[0]);
				int win = Integer.parseInt(dst[1]);
				int draw = Integer.parseInt(dst[3]);
				int score = win * 3 + draw;
				scores.add(score);
				sdst[n] = score;
			}

			Arrays.sort(sdst);
			for(int n=size-1; n>=0; n--){
				int i = scores.indexOf(sdst[n]);
				Ans.add(teams.get(i) + "," + Integer.toString(sdst[n]));
				scores.remove(i);
				teams.remove(i);
			}
			Ans.add("");
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}