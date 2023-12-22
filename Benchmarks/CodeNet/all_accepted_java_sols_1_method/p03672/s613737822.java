import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                sc.close();
                char[] you = new char[s.length() - 1];
                for(int i = 0 ; i < s.length() - 1 ; i++){
                        you[i] = s.charAt(i);
                }
                boolean ebishu = true;
                for(int i = s.length() - 1 ; ebishu && i > 0 ; i--){
                        if(i % 2 == 0){
                                boolean pct = true;
                                for(int j = 0 ; j < i / 2 &&  ebishu ; j++){
                                        if(you[j] != you[j + i / 2]) pct = false;
                                }
                                if(pct){
                                        System.out.println(i);
                                        ebishu = false;
                                }
                        }
                }
        }
}
//鶏になれ
