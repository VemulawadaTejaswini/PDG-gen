import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        StringBuilder sb = new StringBuilder();
        String a = "dream";
        String b = "dreamer";
        String c = "erase";
        String d = "eraser";       
		int e = 0;
        String ans = "NO";
        while(e+4<s.length()){if(s.substring(e,e+5).equals(a))
        {if(e+6<s.length() && s.substring(e,e+7).equals(b)){if(e+9<s.length() && s.substring(e+5,e+10).equals(c)){sb.append(a);e+=5;}else{sb.append(b);e+=7;}}                                                                
             else{sb.append(a);e+=5;}
        }else{if(s.substring(e,e+5).equals(c)){if(e+5<s.length() && s.substring(e,e+6).equals(d)){sb.append(d);e+=6;}else{sb.append(c);e+=5;}}
             else{break;}
             }                                                      
                           }
         String t = sb.toString();
        if(s.equals(t)){ans = "YES";}
		System.out.println(ans);
	}
}