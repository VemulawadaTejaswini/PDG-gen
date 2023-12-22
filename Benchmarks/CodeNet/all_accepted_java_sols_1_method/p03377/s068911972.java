import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int cat = scan.nextInt();
        int catordog = scan.nextInt();
        int catcaunt = scan.nextInt();
        
        String ans;
        
        if(cat > catcaunt){
            ans = "NO";
        }else if(cat + catordog < catcaunt){
            ans = "NO";
        }else{
            ans = "YES";
        }
 
        System.out.println(ans);
        
    }
}