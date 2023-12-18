import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();

			int n = Integer.parseInt(str);

			ArrayList<String> list = new ArrayList<String>(n);

			String[] stringArray = br.readLine().split(" ");

			for(String s: stringArray){
				list.add(s);
			}

			Collections.reverse(list);

			for(int i=0;i<n;i++){
				if(i!=0){
					System.out.print(" " +list.get(i));
				}else{
					System.out.print(list.get(i));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}