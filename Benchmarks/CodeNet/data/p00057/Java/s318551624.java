import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt();
				result.add(n*(n+1)/2+1);
			}
			for(Integer sum : result){
				System.out.println(sum);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}