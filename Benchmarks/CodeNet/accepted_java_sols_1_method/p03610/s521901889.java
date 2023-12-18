import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      	String s = sc.next();
        char[] c = s.toCharArray();
      	
      	for(int i=0;i<s.length();i++){
        	if(i%2 == 0){
            	System.out.print(c[i]);
            }
        }
      System.out.println();
        }
	}