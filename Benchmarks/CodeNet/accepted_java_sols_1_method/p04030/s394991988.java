import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	char[] s = in.next().toCharArray();
      	char[] output = new char[s.length];
      	int k=0;
		 for(int i = 0;i<s.length;i++){
         	if(s[i]!='B'){
           		output[k++] = s[i]; 
            }
           else{
             if(k>0)
           		k--;
           }
         }
      		for(int i =0;i<k;i++){
            	System.out.print(output[i]);
            }
    }
}