import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                int cou = 0;
                boolean ebishu = true;
                if(s.charAt(0) != 'A') ebishu = false;
                for(int i = 2 ; i < s.length() - 1 ; i++){
                        if(s.charAt(i) == 'C'){
                                cou++;
                        }else if(s.charAt(i) >= 97 && s.charAt(i) <= 123){}else{
                                ebishu = false;
                        }
                }
                if(cou != 1) ebishu = false;
                if(s.charAt(s.length() - 1) >= 97 && s.charAt(s.length() - 1) <= 123){}else{
                        ebishu = false;
                }
                if(s.charAt(1) >= 97 && s.charAt(1) <= 123){}else{
                        ebishu = false;
                }
                if(ebishu){
                        System.out.println("AC");
                }else{
                        System.out.println("WA");
                }
        }
}//0=48
 //a=97 a -> +26 = 123
//鶏になれ