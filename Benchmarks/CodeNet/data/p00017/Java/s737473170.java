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
		
		public static void print_sentence (String str,int n){
			int a;
			String res;
			
			ArrayList<Character> str_c = new ArrayList<Character>();
			
			for(int j=0;j<str.length();j++){
					str_c.add(str.charAt(j));
				}
				for(int j=0;j<str_c.size() ;j++){
					a = (int)str_c.get(j);
					if(97 <= a && a <= 122){
						if( (a + n) >= 122){
							a = a  + n - 25;
							str_c.set(j,(char)a);
						}
						else {
							a = a  + n;
							str_c.set(j,(char)a);
						}
					}
				}
				
			for(int i=0;i<str_c.size();i++){
				System.out.print(str_c.get(i));
			}
			System.out.print("\n");
		}
		
		public static int check_sentence (ArrayList<String> a){
			
			String b;
			int count = 0;

			ArrayList<String> target = new ArrayList<String>();
			target.add("the");
			target.add("this");
			target.add("that");
			
			for(int i=0;i<a.size();i++){
				for(int j=1;j<25;j++){
					for(int k=0;k<target.size();k++){
						b = change_word(a.get(i),j);
						if(b.equals(target.get(k))){ count = j; break;}
					}
					if(count != 0) break;
				}
				if(count != 0){
					break;
				}
			}
			return count;
		}
		
		public static ArrayList<Integer> dec_cae (ArrayList<String> a){
			ArrayList<String> rem_str = new ArrayList<String>();
			ArrayList<Integer> res = new ArrayList<Integer>();	
			
			for(int i=0;i<a.size();i++){
				rem_str = remove_sentence(a.get(i));
				res.add(check_sentence(rem_str));
			}
			return res;
		}
		
		public static void main(String args[]) throws IOException{
			String str;

			ArrayList<String> inp = new ArrayList<String>();
			ArrayList<Integer> count = new ArrayList<Integer>();

			Scanner scan = new Scanner(System.in);

			scan.useDelimiter("\n");

			
			while(scan.hasNext()){
				str = scan.next();
				inp.add(str);
			}
			count = (dec_cae(inp));
			for(int i=0;i<count.size();i++){
				print_sentence(inp.get(i),count.get(i));
			}
	}
}