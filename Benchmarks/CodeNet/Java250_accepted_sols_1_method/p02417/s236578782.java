
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[26];
        int i, c;
        String str;
        
        //list = null;
        
        while(sc.hasNext()) {
        	str = sc.nextLine();
        	
        	for(i = 0; i < str.length(); i++) {
        		c = str.toLowerCase().charAt(i) - 97;
        		if(c >= 0) list[c]++;
        	}
        }
        
        for(i = 0; i < 26; i++) {
        	System.out.printf("%s : %d\n", (char)(i + 97), list[i]);
        }
    }
}
