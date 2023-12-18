import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				int[] card = new int[14];
				for(int i = 0; i < s.length; i++){
					card[Integer.parseInt(s[i])-1]++;
				}
				card[13] = card[0];
				int zero = 0;
				int max = 0;
				int countMax = 1;
				int count = 1;
				for(int i = 0; i < 13; i++){
					if( card[i] == 0 ){
						zero++;
					}
					if( card[i] > max ){
						max = card[i];
					}
				}
				if( max == 1 ){
					for(int i = 0; i < 13; i++){
						if( card[i] == 1 && card[i+1] == 1 ){
							count++;
							if( countMax < count ){
								countMax = count;
							}
						}
						if( card[i] == 0 ){
							count = 1;
						}
					}
				}
				
				if( max == 4 ){
					 result.add("four card");
				} else if( max == 3 ){
					if( zero == 11 ){
						result.add("full house");
					} else {
						result.add("three card");
					}
				} else if( max == 2 ){
					if( zero == 10 ){
						result.add("two pair");
					} else {
						result.add("one pair");
					}
				} else if( countMax == 5 ){
					result.add("straight");
				} else {
					result.add("null");
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