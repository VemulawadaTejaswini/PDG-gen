import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ret = true;
        if(s.contains("N")&&(!s.contains("S"))){
            ret = false;
        }
        if(!s.contains("N")&&(s.contains("S"))){
            ret = false;
        }
        if(s.contains("E")&&(!s.contains("W"))){
            ret = false;
        }
        if(s.contains("W")&&(!s.contains("E"))){
            ret = false;
        }

        if(ret) System.out.print("Yes");
        else System.out.print("No");
    }
 }