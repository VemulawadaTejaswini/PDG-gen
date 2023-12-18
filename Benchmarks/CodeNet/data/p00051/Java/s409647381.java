import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> list = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<String> strReverseList = new ArrayList<String>();
		for(int i = 0; i < 8; i++){
			list.add(0);
		}

		String union = "";
		String unionReverse = "";
		int max = 0;
		int min = 0;

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int cnt = 0;

		int num = Integer.parseInt(br.readLine());

		while(cnt< num){

			String str;
			while((str=br.readLine())!=null){
				String[] sp = str.split("");
				for(int i = 0; i < 8; i++){

					list.set(i, Integer.parseInt(sp[i]));
				}

				Collections.sort(list);

				for(int i = 0; i < 8; i++){
					strList.add(String.valueOf(list.get(i)));
				}
				for(int i = 0; i < 8; i++){
					union = union.concat(strList.get(i));
				}

				min = Integer.parseInt(union);

				Collections.reverse(list);

				for(int i = 0; i < 8; i++){
					strReverseList.add(String.valueOf(list.get(i)));
				}
				for(int i = 0; i < 8; i++){
					unionReverse = unionReverse.concat(strReverseList.get(i));
				}

				max = Integer.parseInt(unionReverse);

				System.out.println();
				System.out.println(max - min);
			}
		}
	}

}