import java.io.*;
import java.util.*;

class Main{
		
		public static void main(String args[]) throws IOException{
			ArrayList<Integer> inp = new ArrayList<Integer>();
			ArrayList<Integer> out = new ArrayList<Integer>();
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
				String str1 = scan.next();
				inp.add(Integer.valueOf(str1).intValue());
			}
			
			for(int i=0;i<inp.size();i++){
				if(inp.get(i) != 0) out.add(inp.get(i));
				else{
					System.out.println(out.get(out.size()-1));
					out.remove(out.size()-1);
					}
			}
	}
}