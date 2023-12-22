import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
      	String s = scan.next();
      	int k = scan.nextInt();
      	String b = s.substring(k-1, k);
      	String anstring = s;
      	for(int i = 0; i < N; i++){
        	if(!s.substring(i, i+1).contains(b)){
              	String replaced = s.substring(i, i+1);
            	anstring = anstring.replace(replaced, "*");
            }
        }
     	System.out.print(anstring);
      
      
    }
 
}