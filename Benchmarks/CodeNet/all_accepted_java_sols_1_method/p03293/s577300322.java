import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        ArrayList<String> ary = new ArrayList<>();
        String tmp = s;
        //ary.add(tmp);
        for(int i=0;i<s.length();i++){
            String a = tmp.substring(0, s.length()-1);
            a = tmp.substring(s.length()-1) + a;
            //System.out.println(a);
            ary.add(a);
            tmp = a;
        }
        
        for(String ss : ary){
            if (ss.equals(t)==true){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    
}
