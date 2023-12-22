import java.util.*;

public class Main {
	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   
    String S = sc.next();
    int n = S.length();
    int ans = 1;
    
    for(int i=0; i<n; i++) {
    	if(i % 2 == 0) {
    		if((S.charAt(i) != 'R') && (S.charAt(i) != 'U') && (S.charAt(i) != 'D')) {
    			ans = 0;
    		}
    	}
    	if(i % 2 == 1) {
    		if((S.charAt(i) != 'L') && (S.charAt(i) != 'U') && (S.charAt(i) != 'D')) {
    			ans = 0;
    	}
    }
    }
      if(ans == 1){
        System.out.println("Yes");
      }else{
        System.out.println("No");
}
    }
}

