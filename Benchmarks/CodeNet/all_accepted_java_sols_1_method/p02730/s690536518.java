import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        StringBuilder sb1 = new StringBuilder(s);
        if(!(s.equals(sb1.reverse().toString()))){
        	System.out.println("No");
            return;
        }
        
        String s2 = s.substring(0, (s.length()-1)/2);
        StringBuilder sb2 = new StringBuilder(s2);
        if(!(s2.equals(sb2.reverse().toString()))){
        	System.out.println("No");
            return;
        }
        
        String s3 = s.substring(((s.length()+3)/2)-1);
        StringBuilder sb3 = new StringBuilder(s3);
        if(!(s3.equals(sb3.reverse().toString()))){
        	System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
	}
}