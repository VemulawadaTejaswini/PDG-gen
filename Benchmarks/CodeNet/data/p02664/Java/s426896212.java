import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
       
        for(int i=0;i<s.length();i++){if(s.charAt(i)=='?'){sb.append("D");
                                     }else{sb.append(s.substring(i,i+1));}
                            }
        String t = sb.toString();
		System.out.println(t);
	}
}
