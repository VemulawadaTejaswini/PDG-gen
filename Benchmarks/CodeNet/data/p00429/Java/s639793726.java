import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			if(n==0){break;}

			String keep = br.readLine();
			ArrayList<Integer> answer = new ArrayList<Integer>();
			for(int i=0; i<keep.length(); i++){
				answer.add(Integer.parseInt(keep.substring(i, i+1)));
			}

			for(int i=0; i<n; i++){
				ArrayList<Integer> result = new ArrayList<Integer>();
				int previous = 0;
				int count = 0;

				for(int j=0; j<answer.size(); j++){
					int now = answer.get(j);
					if(now == previous){
						count++;
					}else{
						if(count!=0){
							result = tryadd(result,count);
							result.add(previous);
							}
						previous = now;
						count = 1;
					}
				}
				result = tryadd(result,count);
				result.add(previous);
				answer = result;
			}
			for(Integer ans: answer){
				System.out.print(ans);
			}
			System.out.println();
		}
	}

	static ArrayList<Integer> tryadd(ArrayList<Integer> list, int a ){
		int moto = a;
		int count = 0;
		if( moto >=10){
			while(moto>=10){
				moto /= 10;
				count++;
			}
			list.add(moto);
			return tryadd(list, a-moto*(int)Math.pow(10, count));
		}else{
			list.add(moto);
			return list;
		}
	}
}