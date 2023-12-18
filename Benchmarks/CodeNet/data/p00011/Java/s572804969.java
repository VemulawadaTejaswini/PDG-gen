import java.io.*;
import java.util.*;

class Main{
		public static void main(String args[]) throws IOException{
			ArrayList<String> line_list = new ArrayList<String>();

			Scanner scan = new Scanner(System.in);
			
			int low,line;
			
			low = Integer.parseInt(scan.next());
			line = Integer.parseInt(scan.next());
			
			for(int i=0;i<line;i++){
				String str1 = scan.next();
				String str2 = ","+String.valueOf(i);
				str1 = str1+str2;
				line_list.add(str1);
			}			
			
			int now,priority,list_n,list_a,list_p;
			ArrayList<Integer> res = new ArrayList<Integer>();
			
			for(int i=0;i<low;i++){
				res.add(0);
			}
			
			for(int i=1;i<=low;i++){
				priority = -1;
				now = i;
				for(int j=0;j<line_list.size();j++){
					String[] strAry = line_list.get(j).split(",");
					list_n = Integer.parseInt(strAry[0]);
					list_a = Integer.parseInt(strAry[1]);
					list_p = Integer.parseInt(strAry[2]);
					if(now == list_n && priority < list_p){
						now = list_a;
						priority = list_p;
						j = 0;
					}
					if(now == list_a && priority < list_p){
						now = list_n;
						priority = list_p;
						j = 0;
					}
					else if(priority == (line - 1)){break;}
				}
				res.set(now-1,i);
			}
			
			for(int i=0;i<res.size();i++){
					System.out.println(res.get(i));
			}
			
	}
}