//ｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwｺｹｯwwwｺｹｯｺｯwwwｺｯwwｺｯwwｺｹｯwwwｺｯwwwｺｹｯwwwｺｹｯｺｯwwwｺｹｰｰｰｰｯ!!!wwwwwｺｹｯｺｯｯｺｰｰｰｰ!!!!!!wwwwwwwwwww
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i < n ; i++){
            s[i] = sc.next();
        }
        sc.close();
        boolean ebishu = true;
        for(int i = 1 ; i < n && ebishu ; i++){
            if(s[i - 1].charAt(s[i - 1].length() - 1) != s[i].charAt(0)) ebishu = false;
        }
        Arrays.sort(s);
        for(int i = 1 ; i < n && ebishu ; i++){
            if(s[i - 1].equals(s[i])) ebishu = false;
        }
        if(ebishu){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}