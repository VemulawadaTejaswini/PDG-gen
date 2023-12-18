import java.util.*;
import java.io.*;
 
class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String s = br.readLine();
        char[] c = s.toCharArray();
      	
      	for(int i=0;i<s.length();i++){
        	if(i%2 == 0){
            	System.out.print(c[i]);
            }
        }
      System.out.println();
        }
	}