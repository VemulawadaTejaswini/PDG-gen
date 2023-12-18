import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int[] date = new int[3];
				for(int i = 0; i < 3; i++){
					date[i] = stdIn.nextInt();
				}
				if( date[0] < 1868 || (date[0] == 1868 && (date[1] < 9 || (date[1] == 9 && date[2] < 8))) ){
					System.out.println("pre-meiji");
				} else if( date[0] < 1912 || (date[0] == 1912 && (date[1] < 7 || (date[1] == 7 && date[2] < 30))) ){
					
					System.out.println("meiji" + " " + (date[0]-1867) + " " + date[1] + " " + date[2]);
				} else if( date[0] < 1926 || (date[0] == 1926 && (date[1] < 12 || (date[1] == 12 && date[2] < 25))) ){
					System.out.println("taisho" + " " + (date[0]-1911) + " " + date[1] + " " + date[2]);
				} else if( date[0] < 1989 || (date[0] == 1989 && (date[1] < 1 || (date[1] == 1 && date[2] < 8))) ){
					System.out.println("showa" + " " + (date[0]-1925) + " " + date[1] + " " + date[2]);	
				} else 	{
					System.out.println("heisei" + " " + (date[0]-1988) + " " + date[1] + " " + date[2]);
				}
			}
		} finally {
			if( stdIn != null){
				stdIn.close();
			}
		}
	}
}