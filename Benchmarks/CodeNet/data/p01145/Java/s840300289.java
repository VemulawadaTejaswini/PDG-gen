import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String muse = "ksthp";

		while(true){
			StringBuilder s = new StringBuilder(br.readLine());
			if(s.charAt(0) == '#') break;

			boolean flg = false; //ツ債カツ療猟づ個陛ェツ可ケツつェツ鳴ウツ青コツ可サツつウツづェツつスツつゥ

			for(int i=1;i<s.length();i++){
				char ch = s.charAt(i);
				if(ch == 'i' || ch == 'u'){
					if(flg){flg = false; continue;}
					if((muse.contains(s.substring(i-1,i)) || i>=2 && s.charAt(i-1)=='y' && muse.contains(s.substring(i-2,i-1))) &&
						 (i+1==s.length() || muse.contains(s.substring(i+1,i+2)))){
						s.insert(i+1,")");
						s.insert(i,"(");
						i += 2;
						flg = true;
					}
				}

				else if(ch == 'a' || ch == 'o'){
					if(flg){flg = false; continue;}
					int lastIdx = i;
					for(int j=i;j<s.length();j++){
						char c = s.charAt(j);
						if(c == 'n' || c == 'i' || c == 'u' || c == 'e' ||
							 c == 'a' && ch != 'a' || c == 'o' && ch != 'o') break;
						if(c != ch) continue;

						char l1 = s.charAt(j-1);
						char l2 = j-2>=0 ? s.charAt(j-2) : '?'; //ツ適ツ督鳴づ按閉カツ篠堋づーツ禿シツづェツづつィツつュ
						char l3 = j-3>=0 ? s.charAt(j-3) : '*'; //ツ適ツ督鳴づ按閉カツ篠堋づーツ禿シツづェツづつィツつュ

						if(!muse.contains(""+l1) && !(l1=='y' && muse.contains(""+l2))) break;

						//ツ堕」ツ可ケツ・ツ陳キツ可ケツつェツ債ャツつエツづづつ「ツづゥツ湘ェツ債陳断
						if(c == 'a' && l1=='a' ||
							 j != i && (l1 == l2 || l1 == 'y' && l2 == l3) &&
							 l2 != 'n' && l2!='i' && l2!='u' && l2!='e') break;

						lastIdx = j;
					}

					for(int j=i;j<=lastIdx-1;j++){
						if(s.charAt(j) == ch){
							if(flg){flg=false;continue;}
							s.insert(j+1,")");
							s.insert(j,"(");
							j += 2;
							lastIdx += 2;
							flg = true;
						}
					}
					flg = false;
					i = lastIdx;
				}
				else if(ch == 'e'){
					if(flg){flg = false; continue;}
				}
			}

			System.out.println(s);
		}
	}
}