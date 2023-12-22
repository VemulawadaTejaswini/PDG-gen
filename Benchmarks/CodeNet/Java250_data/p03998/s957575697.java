import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String s = "a";
        for(int i = 0; i < 301; i++){
        	if(s.equals("a")){
                if(a.isEmpty()){
                    System.out.println("A");
                    return;
                }else{
                	s = a.substring(0,1);
            		a = a.substring(1);
                }
            }else if(s.equals("b")){
            	if(b.isEmpty()){
                    System.out.println("B");
                    return;
                }else{
                	s = b.substring(0,1);
            		b = b.substring(1);
                }
            }else if(s.equals("c")){
            	if(c.isEmpty()){
                    System.out.println("C");
                    return;
                }else{
                	s = c.substring(0,1);
            		c = c.substring(1);
                }
            }
        }
    }
}