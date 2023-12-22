import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int[] n = new int[3];
				for(int i = 0; i < 3; i++){
					n[i] = stdIn.nextInt();
				}
				int sum = n[0]+n[1];
				int remain = 20-sum;
				int num = remain;
				for(int i = 0; i < 3; i++){
					if( n[i] <= remain ){
						num--;
					}
				}
				if( num >= 4 ){
					result.add("YES");
				} else {
					result.add("NO");
				}
			}
			for(String str : result){
				System.out.println(str);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}

	