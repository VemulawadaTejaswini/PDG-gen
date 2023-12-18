import java.io.*;
import java.util.*;

class Main{
	
	public static void sentence(ArrayList<String> list){
		int max_l= 0,max=0,m_count=0,l,count;
		
		String str,str1,str2;
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			l = str.length();
			if(l > max_l)
				max_l = l;
		}
		
		for(int i=0;i<list.size();i++){
			count = 0;
			for(int j=0;j<list.size();j++){
				if(i == j) continue;
				str1 = list.get(i);
				str2 = list.get(j);
				if(str1.equals(str2))
					count++;
			}
			if(m_count < count){
				m_count = count;
				max = i;
			}
		}
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			if(i == max)
				System.out.print(str + " ");
		}
		
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			l = str.length();
			if(l == max_l)
				System.out.println(str);
		}
		
	}

	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <String> inp = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
			str = scan.next();
			inp.add(str);
		}
		sentence(inp);
	}
}