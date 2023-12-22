import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		int count = 3000; // ?????§???????????°(??????)
		int t = 0;//?????????????????°
		int temp = 0;
		int flag = 0;
		String str;
		String[] convert = new String[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> compare = new ArrayList<Integer>();
		/**
		 * ???????????\???
		 */
		while (t != count) { // ?????§3000???
			str = br.readLine();
			if(str.equals("0 0")){ // "0 0"??§??????
				break;
			}
			convert = str.split(" ", 0);
			for(int j = 0; j < 2; ++j){
				temp = Integer.parseInt(convert[j]);
				if(temp < 0 || temp >10000){
					flag = 1;
					break;
				}
				compare.add(temp);
			}
			++t;
			}
		int length = compare.size();
		/**
		 * ??¨?????????
		 */
		if(flag == 0){
		for(int i = 0; i < length; i+=2){
			if(compare.get(i) > compare.get(i+1)){
				System.out.println(compare.get(i+1)+" "+compare.get(i));
			}
			else if(compare.get(i) < compare.get(i+1)){
				System.out.println(compare.get(i)+" "+compare.get(i+1));
			}
			else{
				System.out.println(compare.get(i)+" "+compare.get(i+1));
			}
		}
		}
	}

}