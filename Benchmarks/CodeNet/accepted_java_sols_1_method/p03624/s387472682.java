import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                sc.close();
                char[] a = new char[s.length()];
                for(int i = 0 ; i < s.length() ; i++){
                        a[i] = s.charAt(i);
                }
                Arrays.sort(a);
                char pct = 'a';
                boolean ebishu = true;
                for(int i = 0 ; i < 26 && ebishu ; i++){
                        if(i != 0) pct++;
                        boolean bool = true;
                        for(int j = 0 ; j < s.length() && ebishu ; j++){
                                if(s.charAt(j) == pct) bool = false;
                        }
                        if(bool){
                                System.out.println(pct);
                                ebishu = false;
                        }
                }
                if(ebishu) System.out.println("None");
        }
}//0=48
//鶏になれ