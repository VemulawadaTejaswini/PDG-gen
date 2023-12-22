import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<String>();
		List<Integer> cnt = new ArrayList<Integer>();

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		str=br.readLine();
		String[] sp = str.split(" ");

		for(int i = 0; i < sp.length; i++){
			list.add(sp[i]);
		}

		for(int i = 0; i < sp.length; i++){
			cnt.add(0);
			for(int j = 0; j < sp.length; j++){
				if(list.get(i).equals(list.get(j))){
					cnt.set(i, cnt.get(i) + 1);
				}
			}
		}

		int max1 = 0;
		int max2 = 0;
		String ans1 = "";
		String ans2 = "";

		for(int i = 0; i < sp.length; i++){
			if(max1 < cnt.get(i)){
				max1 = cnt.get(i);
				ans1 = list.get(i);
			}

			if(max2 < list.get(i).length()){
				max2 = list.get(i).length();
				ans2 = list.get(i);
			}
		}

		System.out.println(ans1 + " " + ans2);
	}
}