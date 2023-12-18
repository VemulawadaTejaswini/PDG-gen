import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
        String t = sc.next();
        int ans = t.length();
        for(int i=0;i<=s.length()-t.length();i++){int count = t.length();
                                         for(int j=0;j<t.length();j++){if(s.charAt(i+j)==t.charAt(j)){count--;}                              
                                                                      }
                            ans=Math.min(ans,count);
                                        }        
		System.out.println(ans);
	}
}