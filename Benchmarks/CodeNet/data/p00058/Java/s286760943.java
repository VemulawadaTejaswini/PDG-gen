import java.util.*;
import java.io.*;

public class Main{
	public static String judge(double[][] n){		
		if( n[1][0]-n[0][0] == 0 && n[3][1]-n[2][1] == 0 ){
			return "YES";
		}
		if( n[3][0]-n[2][0] == 0 && n[1][1]-n[0][1] == 0 ){
			return "YES";
		}
		double a = (n[1][1]-n[0][1])/(n[1][0]-n[0][0]);
		double b = (n[3][0]-n[2][0])/(n[3][1]-n[2][1]);
		if( a == -b ){
			return "YES";
		}
		return "NO";
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				double[][] n = new double[4][2];
				for(int i = 0; i < 4; i++){
					for(int j = 0; j < 2; j++){
						n[i][j] = stdIn.nextDouble();
					}
				}
				result.add(judge(n));
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

				