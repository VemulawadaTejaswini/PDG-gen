import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        if(st.charAt(0) == st.charAt(1) && st.charAt(0) == st.charAt(2)){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
    }
}