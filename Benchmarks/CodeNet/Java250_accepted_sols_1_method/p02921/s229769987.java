import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	String t = sc.next();
      	
      	char[] slist = new char[3];
      	for(int i = 0; i < s.length(); i++){
          	slist[i] = s.charAt(i);
        }
      	
      	char[] tlist = new char[3];
      	for(int i = 0; i < t.length(); i++){   	
          	tlist[i] = t.charAt(i);
        }
      	
      	int result = 0;
      
      	for(int i = 0; i < slist.length; i++){
          	if(slist[i] == tlist[i]){
            	result += 1;
            }
        }
      
      System.out.println(result);
	}
}