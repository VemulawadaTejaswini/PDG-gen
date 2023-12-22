import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	char[] s = in.next().toCharArray();
      	int freq[] = new int[26];
      	for(int i=0;i<s.length;i++){
        	freq[s[i]-'a']++;
        }
      	boolean check = true;
      	for(int i =0;i< 26;i++){
        	if(freq[i]%2!=0){
            	check = false;
              break;
            }
     
        }
      	if(!check){
        	System.out.println("No");
        }
      	else{
        	System.out.println("Yes");
        }
    }
}