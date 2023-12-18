import static java.lang.System.*;

import java.util.Scanner;

class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        
        for(int a = 1; a <= str.length(); a++) {
        	if(String.valueOf(str.charAt(a - 1)).equals(
        	     String.valueOf(str.charAt(a - 1)).toUpperCase())) {
        		 
        		str1 += String.valueOf(str.charAt(a - 1)).toLowerCase();
        	}else {
        		str1 += String.valueOf(str.charAt(a - 1)).toUpperCase();
        	}
        	
        }
        out.println(str1);
    }
}
