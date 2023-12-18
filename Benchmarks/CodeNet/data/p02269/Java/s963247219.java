import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{

	BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
	String[] yomikomi=new String[2];
	List<String> jisyo=new ArrayList<String>();
	String yomi="";

	int limit=Integer.parseInt(bfr.readLine());

	for(int i=0; i<limit; i++){
			yomikomi=bfr.readLine().split(" ");

			if(yomikomi[0].equals("insert")){
				jisyo.add(yomikomi[1]);
			}

			else if(yomikomi[0].equals("find")){
				if(jisyo.contains(yomikomi[1])==false){
					System.out.println("no");
				}
				else{
					System.out.println("yes");
				}
			}
		}
	}
}
