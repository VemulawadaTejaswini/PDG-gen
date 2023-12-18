import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String t[];
		while((s = r.readLine()) != null){
			t = s.split(" ");
			if(t[0].equals("i")){
				print_i(t[1],t[2]);
			} else if(t[0].equals("u")){
				print_u(t[1],t[2]);
			}
		}
	}
	static void print_i(String a, String b){
		String p = "";
		int i = 0,j = 0;
		int k = a.length();
		int l = b.length();
		char[] s = new char[k];
		char[] t = new char[l];
		a.getChars(0,k,s,0);
		b.getChars(0,l,t,0);
		while(i < k && j < l){
			if(s[i] == t[j]){
				p = p+ t[j];
				i++;j++;
			} else if(s[i] == '('){
				while(s[i++] != ')'){
				}
			} else if(t[j] == '('){
				while(t[j++] != ')'){
				}
			}
		}
		System.out.println(p);
	}
	static void print_u(String a, String b){
		String p = "";
		int i = 0,j = 0;
		int k = a.length();
		int l = b.length();
		char[] s = new char[k];
		char[] t = new char[l];
		a.getChars(0,k,s,0);
		b.getChars(0,l,t,0);
		while(i < k && j < l){
			if(s[i] == t[j]){
				p = p + s[i];
				++i;++j;
			} else if(s[i] == '('){
				while(s[i] != ')'){
					p = p + s[i];
					++i;
				}	
				p = p + s[i];
				++i;
			} else if(t[j] == '('){
				while(t[j] != ')'){
					p = p + t[j];
					++j;
				}
				p = p + t[j];
				++j;
			}
		}
		System.out.println(p);
	}
}