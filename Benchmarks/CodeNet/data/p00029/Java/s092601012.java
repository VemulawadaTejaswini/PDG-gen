import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.toLowerCase().split(" ");
		String most = null;
		ArrayList<String> list = new ArrayList<String>();
		int result=0;

		for(int i=0; i<strArray.length; i++){
			list.add(strArray[i]);
		}

		Collections.sort(list);

		for(int i=0; i<strArray.length; i++){
			int count = 0;
			for(int j=0; j<strArray.length; j++){
				if(i != j){
					if(strArray[i].equals(strArray[j])){
						count++;
					}
				}
			}
			if(count>result){
				result = count;
				most = strArray[i];
			}
		}
		System.out.println(most + " " + strArray[strArray.length-1]);
	}
}