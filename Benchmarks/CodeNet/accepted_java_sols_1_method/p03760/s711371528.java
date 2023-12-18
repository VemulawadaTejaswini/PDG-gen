
import java.io.*;
import java.util.*;

// ** Change to Main. 
class Main {
    public static void main(String[] args) throws IOException {
		
		// ** Get this back for submission. 
		Scanner sc = new Scanner(System.in);
		
		// Write your code here. 
		
		String o = sc.next();
		String e = sc.next();
		
		StringBuilder ans = new StringBuilder();
		int lenO = o.length();
		int lenE = e.length();
		int po = 0, pe = 0;
		for (int i = 0; i < lenO + lenE; i++) {
			if (i % 2 == 0) {
				ans.append(o.charAt(po));
				po++;
			} else {
				ans.append(e.charAt(pe));
				pe++;
			}
		}
		
		System.out.println(ans.toString());
        
        
        
        
    }
}





































