import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		List<Integer> list = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				int number = Integer.parseInt(s[0]);
				double height = Double.parseDouble(s[2]);
				double weight = Double.parseDouble(s[1]);
				if( weight/(height*height) >= 25 ){
					list.add(number);
				}
			}
			if( list.size() == 0 ){
				System.out.println("該当なし");
			} else {
				for(Integer ans : list){
					System.out.println(ans);
				}
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}