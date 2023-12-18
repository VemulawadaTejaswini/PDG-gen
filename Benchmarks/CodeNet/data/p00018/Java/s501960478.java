import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] str = null;
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0; i<str.length; i++){
			list.add(Integer.parseInt(str[i]));
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int n : list){
			System.out.print(n + " ");
		}
	}
}