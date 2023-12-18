import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split("\\+");
			String str1 = tmpArray[0];
			tmpArray = tmpArray[1].split("=");
			String str2 = tmpArray[0];
			String str3 = tmpArray[1];
			
			//System.out.println(str1+" "+str2+" "+str3);
			//?????????
			boolean solve = false;
			for(int i = 0; i <= 9 ; i++){
				BigInteger a = replaceXtoNumber(str1, i);
				BigInteger b = replaceXtoNumber(str2, i);
				BigInteger c = replaceXtoNumber(str3, i);
				
				if(a != null && b != null && c != null){
					if(a.add(b).compareTo(c) == 0){
						System.out.println(i);
						solve = true;
						break;
					}
				}
			}
			if(!solve){
				System.out.println("NA");
			}
		}
	}
	
	static BigInteger replaceXtoNumber(String str, int n){
		if(str.length() >= 2 && str.charAt(0) == 'X' && n == 0){
			return null;
		}
		String tmp = new String(str);
		
		tmp = tmp.replace('X', (char) ('0'+n));
		//System.out.println(tmp);
		
//		return Long.parseLong(tmp);
		return new BigInteger(tmp);
	}

}