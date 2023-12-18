import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		
		//str2????????????????????¨?????????????????????????????´?????¨????????¢
//		char str2Top = str2.charAt(0);
//		int distTopChar = 1 + str2.substring(1, str2.length()).indexOf(str2Top);
//		System.out.println(distTopChar);
		
		int sumOfIndex = 0;
		while(true){
			//System.out.println(str1 + " " + str2);
			int index = str1.indexOf(str2);
			
			if(index == -1){
				break;
			}
			
			sumOfIndex += index;
			System.out.println(sumOfIndex);
			
			int next = str2.charAt(0);
			
			if(next < 0 || str1.indexOf(next, index + 1) < 0){
				break;
			}
			//System.out.println("skip "+str1.indexOf(next, index + 1));
			//str1 = str1.substring(str1.indexOf(next, index + 1), str1.length());
			str1 = str1.substring(index + 1, str1.length());
			sumOfIndex++;
			if(str1.length() == 0){
				break;
			}
			//System.out.println(str1);
		}
	}

}