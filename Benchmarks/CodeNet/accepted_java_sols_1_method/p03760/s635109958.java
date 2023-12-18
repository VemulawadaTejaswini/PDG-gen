import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        String E = sc.next();
        char[]e = E.toCharArray();
        
        if(S.length() == E.length()) {
        	for(int i=0; i<S.length(); i++) {     	
        		System.out.print(ss[i]);    
        		System.out.print(e[i]);
        	}
        	}else {
        	for(int i=0; i<E.length(); i++) {     	
        		System.out.print(ss[i]);    
        		System.out.print(e[i]);	
        	}
        		System.out.print(ss[S.length()-1]);
        }
    }
}