import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[] input = new int[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				if( stdIn.hasNextInt() ){
					input[index] = stdIn.nextInt();
					index++;
				} else {
					stdIn.next();
				}
			}
			String[] num = {"1","2","4","8","16","32","64","128","256","512"};
			for(int i = 0; i < index; i++){
				String str = Integer.toBinaryString(input[i]);
				StringBuilder result = new StringBuilder();
				for(int j = 0; j < str.length(); j++){
					if( str.charAt(str.length()-1-j) == '1' ){
						result.append(num[j] + " ");
					}
				}
				result.deleteCharAt(result.length()-1);
				System.out.println(result);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}