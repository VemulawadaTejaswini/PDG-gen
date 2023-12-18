import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
    Scanner sc=new Scanner(System.in);
    
	
		    int n = sc.nextInt();
		    String s = sc.next();
		    char str[] = s.toCharArray();
		    Arrays.sort(str);
		    long count=0;
		    Set<Character> set = new HashSet<>();
		    for(int i=0;i<n;i++){
		        set.add(s.charAt(i));
		    }
		    
		    if(set.size()==1){
		        System.out.println(0);
		    }
		    else{
		    for(int i=0;i<n;i++){
		       if(s.charAt(i)==str[i]){
		           continue;
		       }
		       else{
		           count+=1;
		       }
		      
		    }
		    System.out.println(count/2);
		    }
		
    }
}