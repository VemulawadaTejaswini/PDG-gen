import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        
        s = s + t.charAt(n);
        
        // System.out.println(s+" "+t);
        
        if(s.equals(t)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    
}