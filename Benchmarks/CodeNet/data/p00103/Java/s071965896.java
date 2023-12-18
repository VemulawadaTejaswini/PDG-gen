import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<String> base = new ArrayList<String>();
		List<Integer> inning = new ArrayList<Integer>();
		int inningCnt =0;

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int num = Integer.parseInt(br.readLine());

		while(inningCnt < num){

			inning.add(0);
			int out = 0;

			String str;
			while((str=br.readLine())!=null){

				switch(str){

				case "HIT":
					base.add("runner");
					if(base.size() == 4){
						inning.set(inningCnt, inning.get(inningCnt) + 1);
						base.remove(3);
					}
					break;

				case "HOMERUN":
					inning.set(inningCnt, inning.get(inningCnt) + base.size() + 1);
					base.removeAll(base);
					break;

				case "OUT":
					out++;
					break;
				}

				if(out == 3){
					base.removeAll(base);
					break;
				}

			}

			inningCnt++;
		}

		for(int i = 0; i < inningCnt; i++){

			System.out.println(inning.get(i));

		}
	}

}