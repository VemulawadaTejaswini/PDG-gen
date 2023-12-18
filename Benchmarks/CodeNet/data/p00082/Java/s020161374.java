import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		char[] num = {'1','4','1','4','1','2','1','2','1','4','1','4','1','2','1'};
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.nextLine();
				String[] s = str.split(" ");
				int min = -1;
				String key = new String();
				for(int i = 0; i < 8; i++){
					int sum = 0;
					for(int j = 0; j < 8; j++){
						sum += (num[i+j] < s[j].charAt(0)) ? (int)(s[j].charAt(0)-num[i+j]) : 0;
					}
					if( min < 0 || sum <= min ){
						char[] temp = new char[8];
						for(int j = 0; j < 8; j++){
							temp[j] = num[i+j];
						}
						String key2 = new String(temp);
						if( sum < min ){
							key = new String(key2);
						} else if( key.equals("") || Integer.parseInt(key2) < Integer.parseInt(key) ){
								key = new String(key2);
						}
						min = sum;							
					}
				}
				for(int i = 0; i < 7; i++){
					System.out.print(key.charAt(i) + " ");
				}
				System.out.println(key.charAt(7));				
			}			
		} finally {
			if( stdIn != null){
				stdIn.close();
			}
		}
	}
}