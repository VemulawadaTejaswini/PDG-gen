import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ;i++){
			String input = br.readLine();
			
//			int pattern = 0;
			HashSet<String> set = new HashSet<String>();
			for(int j= 1; j < input.length() ; j++){
				String sub1 = input.substring(0, j);
				String sub2 = input.substring(j, input.length());
				String rev1 = new StringBuffer(sub1).reverse().toString();
				String rev2 = new StringBuffer(sub2).reverse().toString();
				
				
				set.add(sub1+sub2);
				set.add(sub1+rev2);
				set.add(rev1+sub2);
				set.add(rev1+rev2);
				set.add(sub2+sub1);
				set.add(sub2+rev1);
				set.add(rev2+sub1);
				set.add(rev2+rev1);
//				System.out.println("j = "+j+" patter "+set.size());
//				System.out.println(set.toString());
//				pattern += set.size();
			}
			
			System.out.println(set.size());
		}
	}

}