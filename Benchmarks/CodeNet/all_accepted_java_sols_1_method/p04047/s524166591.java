import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String in2 = br.readLine();
			ArrayList<Integer> aList = new ArrayList<Integer>();
			int res = 0;

			for( String str:in2.split(" ") ){
				aList.add(Integer.parseInt(str));
			}

			Collections.sort(aList,Collections.reverseOrder());


			for(int i=0;i<n*2;i++){
				i = i+1;
				res = res + aList.get(i);
			}

			System.out.println(res);

		}  catch (IOException e) {
			e.printStackTrace();
		}

	}

}
