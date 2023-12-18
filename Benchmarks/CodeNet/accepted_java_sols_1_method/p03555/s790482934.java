//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c = sc.next();
        sc.close();
        if(s.charAt(0) == c.charAt(2) && s.charAt(1) == c.charAt(1) && s.charAt(2) == c.charAt(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}