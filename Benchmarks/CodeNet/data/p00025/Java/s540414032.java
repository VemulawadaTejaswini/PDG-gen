import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input ="";
		ArrayList<Integer> senkou = new ArrayList<Integer>();
		ArrayList<Integer> koukou = new ArrayList<Integer>();

		int counter = 0;

		while((input = br.readLine()) != null){
			counter++;
			if(counter % 2 == 1){
				senkou = spliter(input);
			}else{
				koukou = spliter(input);
				judge(senkou,koukou);
			}
		}


	}

	public static ArrayList<Integer> spliter(String input){
		String[] snum = input.split(" ");
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i = 0;i < snum.length;i++){
			num.add(Integer.parseInt(snum[i]));
		}
		return num;

	}

	public static void judge(ArrayList<Integer> senkou,ArrayList<Integer> koukou){
		int hit = 0;
		int blow = 0;
		if(senkou.size() != koukou.size()) {System.out.println("?????£????????§???");}
		for(int i = 0;i < senkou.size();i++){
			if(senkou.get(i) == koukou.get(i)){ hit++; continue;}
			for(int j = 0;j < koukou.size();j++){
				if(senkou.get(i) == koukou.get(j)){blow++;break;}
			}
		}
		System.out.println(hit + " " + blow);
	}

}