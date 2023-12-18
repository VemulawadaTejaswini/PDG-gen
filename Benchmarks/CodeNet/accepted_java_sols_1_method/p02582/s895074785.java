import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int count;
      	if(s.charAt(0)=='S' &&s.charAt(1)=='S' &&s.charAt(2)=='S') count = 0;
      	else if((s.charAt(0)=='R' &&s.charAt(1)=='R' &&s.charAt(2)=='S')
                ||(s.charAt(0)=='S' &&s.charAt(1)=='R' &&s.charAt(2)=='R')) count= 2;
      	else if (s.charAt(0)=='R' &&s.charAt(1)=='R' &&s.charAt(2)=='R') count = 3;
      	else count = 1;
      	
      	System.out.println(count);
    }
}