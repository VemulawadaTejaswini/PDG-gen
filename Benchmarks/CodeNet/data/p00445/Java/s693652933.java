import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		String[] str = new String[100];
		int[][] result = new int[100][2];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			
			while( stdIn.hasNext() ){
				str[index] = stdIn.next();
				index++;
			}
			
			int count = 0;
			for(int i = 0; i < index; i++){
				for(int j = 0; j < str[i].length()-2; j++){
					if( str[i].charAt(j) == 'J' ){
						if( str[i].charAt(j+1) == 'O' && str[i].charAt(j+2) == 'I' ){
							result[i][0]++;
						}
					}else if( str[i].charAt(j) == 'I' ){
						if( str[i].charAt(j+1) == 'O' && str[i].charAt(j+2) == 'I' ){
							result[i][1]++;
						}
					}
				}
			}
			for(int i = 0; i < index; i++){
				System.out.println(result[i][0]);
				System.out.println(result[i][1]);
			}
		}finally{
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}