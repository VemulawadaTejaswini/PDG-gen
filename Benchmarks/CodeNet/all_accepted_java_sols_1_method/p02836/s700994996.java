
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = 1;
        int count = 0;
        
        if(S.length()  % 2 == 0) {
        	n = S.length();
        } else {
        	n = S.length() - 1;
        }
        
        for(int i =0; i < n/2; i++) {
        	if(S.charAt(i) != S.charAt(S.length()-1-i)) {
        		count ++;
        	}
        }
        
        System.out.println(count);   
        

    }
}




