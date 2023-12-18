import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Set<String> set = new TreeSet<String>();

		for(int i = 0; i < n; i++){
			String[] coms = br.readLine().split(" ");
			if(coms[0].equals("insert")){
				set.add(coms[1]);
			}else if(coms[0].equals("find")){
				System.out.printf("%s\n",set.contains(coms[1])? "yes" : "no");
			
			}
		}
	}
}