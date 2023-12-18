import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[]W = new String[n];
    ArrayList<String>ans  = new ArrayList<>();
    
    for(int i=0; i<n; i++) {
    	W[i] = sc.next();
    	if(!ans.contains(W[i])){		
    	      ans.add(W[i]);
    }
    } 	
    int cou = 0;
    for(int i=0; i<n-1; i++) {
    	if(W[i].charAt(W[i].length()-1) != (W[i+1].charAt(0))){
    		cou++;
    }
    }
    if(ans.size()!=n){	
        	System.out.println("No");
    }else if(cou != 0){
    	  System.out.println("No");
    }else {
    	 System.out.println("Yes");
     }
}
}
