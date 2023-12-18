
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(Integer.parseInt(s[0]));
		ls.add(Integer.parseInt(s[1]));
		ls.add(Integer.parseInt(s[2]));
		Collections.sort(ls);
		for(int i = 0 ; i < ls.size(); i++){
			if(i != ls.size()-1){
				System.out.print(ls.get(i)+" ");
			}else{
				System.out.print(ls.get(i));
			}
		}
	}

}