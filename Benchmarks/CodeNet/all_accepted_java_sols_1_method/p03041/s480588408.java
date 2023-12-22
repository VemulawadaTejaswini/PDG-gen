import java.util.Scanner;
 
public class Main{
		
	public static void main(String args[]){
		  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		int no = (int)s.charAt(k-1) - (int)'A' + (int)'a';
        char c = (char)no;
        
        String out = "";
        for(int i = 0; i < s.length(); i++) {
        	if(i == k-1) {
        		out += c;
        	}else {
        		out += s.charAt(i);
        	}
        }
        
        System.out.println(out);
		
		
		
	}
}
