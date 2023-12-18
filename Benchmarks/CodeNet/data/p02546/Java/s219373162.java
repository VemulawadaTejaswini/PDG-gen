import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        String s = sc.nextLine();
        String ans = "";
        if(s.charAt(s.length()-1) == 's'){
            ans = ans + "es";
        }else{
            ans = ans + "s";
        }
        System.out.println(ans);
    }
}