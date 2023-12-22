import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	
    public static void main(String[] a){
    	
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int numDS = -1;
		int aSide = -1;
		int bSide = -1;
		int cSide = -1;
		
		ArrayList <String> results = new ArrayList<String>();
		
		//get number of data sets
    	try {
			while ((line = stdin.readLine()) != null && 
					line.length()!= 0) {
				
				String[] checker = line.split(" ");
				
				if (checker.length == 1){
					numDS = Integer.parseInt(checker[0]);
				} else if (checker.length == 3){
				
					int temp1 = Integer.parseInt(checker[0]);
					int temp2 = Integer.parseInt(checker[1]);
					int temp3 = Integer.parseInt(checker[2]);
					
					if (temp1 < 1 || temp1 >1000 ||
						temp2 < 1 || temp2 >1000 ||
						temp3 < 1 || temp3 >1000){
						results.add("NO");
					} else {
						//get the highest number and place to cSide
						if (temp1 > temp2 && temp1> temp3){
							cSide = temp1;
							aSide = temp2;
							bSide = temp3;
						} else if (temp2 > temp1 && temp2 > temp3){
							cSide = temp2;
							aSide = temp1;
							bSide = temp3;
						} else {
							cSide = temp3;
							aSide = temp2;
							bSide = temp1;
						}
						
						//Pythagorean
						if ((cSide*cSide) == ((aSide*aSide)+(bSide*bSide))){
							results.add("YES");
						} else {
							results.add("NO");
						}
						
						if (results.size() == numDS){
							break;
						}
					}
				}
			}

			//print result
			for (String s: results){
				System.out.println(s);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
    }
}