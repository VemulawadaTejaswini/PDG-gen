import java.io.*;
import java.util.*;

class Main{
	
		public static ArrayList<String> remove_sentence (String a){
			ArrayList<String> b = new ArrayList<String>();
			
			String[] strAry = a.split(" ");
			strAry[strAry.length-1] = strAry[strAry.length-1].replaceAll("\\.","");
			for(int i=0;i<strAry.length;i++){
				if(strAry[i].length() == 3 || strAry[i].length() == 4) b.add(strAry[i]);
			}
			
			return b;
		}
		
		public static String change_word (String str,int n){
			String res = "";
			int a;
			char[] a_c = str.toCharArray();
			char buf;
			
			for(int i=0;i<a_c.length;i++){
				a = (int)a_c[i];
				if( (a + n) > 122){
						a = a  + n - 25;
						a_c[i] = (char)a;
				}
				else {
					a = a  + n;
					a_c[i] = (char)a;
				}
			}
			
			res = String.valueOf(a_c);
			return res;
		}
		
		public static void print_sentence (ArrayList<String> str,int n){
			int a;
			String res;
			
			for(int i=0;i<str.size();i++){
				char[] str_c = str.get(i).toCharArray();
				for(int j=0;j<str_c.length ;j++){
					a = (int)str_c[j];
					if(97 <= a && a <= 122){
						if( (a + n) >= 122){
							a = a  + n - 25;
							str_c[j] = (char)a;
						}
						else {
							a = a  + n;
							str_c[j] = (char)a;
						}
					}
				}
			res = String.valueOf(str_c);
			
			if(i != str.size()-2) System.out.print(res +" ");
			else System.out.print(res);
			}
			System.out.print("\n");
		}
		
		public static void check_sentence (ArrayList<String> a,ArrayList<String> str){
			
			String b;
			int count = 0;
			ArrayList<String> target = new ArrayList<String>();
			target.add("the");
			target.add("this");
			target.add("that");
			
			for(int i=0;i<a.size();i++){
				count = 0;
				for(int j=1;j<25;j++){
					for(int k=0;k<target.size();k++){
						b = change_word(a.get(i),j);
						if(b.equals(target.get(k))){ count = j; break;}
					}
					if(count != 0) break;
				}
				if(count != 0) break;
			}
			
			print_sentence(str,count);
		}
		
		public static void dec_cae (ArrayList<String> a){
			ArrayList<String> rem_str = new ArrayList<String>();
			for(int i=0;i<a.size();i++){
				rem_str = remove_sentence(a.get(i));
				check_sentence(rem_str,a);
			}
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			double n1,n2;
			ArrayList<String> inp = new ArrayList<String>();
			Scanner scan = new Scanner(System.in);
			scan.useDelimiter("\n");
			
			while(scan.hasNext()){
				str = scan.next();
				inp.add(str);
			}
			dec_cae(inp);
	}
}