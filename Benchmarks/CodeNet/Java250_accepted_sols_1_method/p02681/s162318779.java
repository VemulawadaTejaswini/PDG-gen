import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner o = new Scanner(System.in);
        String s1 = o.nextLine();
        String s2 = o.nextLine();
        boolean ok = true;
        for ( int i = 0 ; i < s1.length() ; i++ )
        {
            if ( s1.charAt(i) != s2.charAt(i) )
            {
                ok = false;
                break;
            }
        }

        if(!ok){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
    }
}