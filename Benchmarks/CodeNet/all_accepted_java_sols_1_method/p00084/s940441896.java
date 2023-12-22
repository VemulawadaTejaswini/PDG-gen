import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				List<String> list = new ArrayList<String>();
				String str = stdIn.nextLine();
				String[] s1 = str.split(" ");				
			outer:	for(String s_1 : s1){
					String[] s2 = s_1.split(",");
					for(String s_2 : s2){
						String[] s3 = s_2.split("\\.");
						for(String s : s3){
							if( s.length() >= 3 && s.length() <= 6 ){							
								list.add(s);
							}
						}
					}
				}
				for(int i = 0; i < list.size()-1; i++){
					System.out.print(list.get(i) + " ");
				}
				System.out.println(list.get(list.size()-1));
			}
		} finally {
			if( stdIn != null){
				stdIn.close();
			}
		}
	}
}