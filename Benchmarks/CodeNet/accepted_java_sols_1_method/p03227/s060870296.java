import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
      	char ss[] = new char[3];
      
      	if(s.length() == 3){
      		for(int i = 0; i < 3; i++) ss[i] = s.charAt(3-i-1);
          	for(int i = 0; i < 3; i++) System.out.print(ss[i]);
          	System.out.println();
        } else System.out.println(s);      	
        
	}
}