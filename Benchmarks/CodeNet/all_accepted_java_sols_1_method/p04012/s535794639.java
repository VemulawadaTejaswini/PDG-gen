import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String w = sc.next();
      	int[] eng = new int[26];
      	boolean res = true;
      	for(int i = 0; i < w.length(); i++){
        	eng[w.charAt(i)-'a']++;
        }
      	for(int i = 0; i < 26; i++){
        	if(eng[i] % 2 != 0) res = false;
        }
      	if(res){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}