import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	int[] a = new int [26];
      	for(int i = 0; i < s.length; i++){
        	a[s[i]-'a']++;
        }
      	boolean exist = false;
      	for(int i = 0; i < 26; i++){
        	if(a[i] > 1) exist = true;
        }
      
      	if(exist) System.out.println("no");
      	else System.out.println("yes");
    }
}