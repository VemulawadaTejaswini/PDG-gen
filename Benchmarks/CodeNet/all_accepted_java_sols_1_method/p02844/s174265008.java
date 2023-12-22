import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int res = 0;
        
        boolean a[] = {false,false,false,false,false,false,false,false,false,false};
        boolean b[] = {false,false,false,false,false,false,false,false,false,false};
        boolean c[] = {false,false,false,false,false,false,false,false,false,false};
        
        for(int i = 0;i < S.length();i++){
            int a1 = Character.getNumericValue(S.charAt(i));
            if(!a[a1]){
                a[a1] = true;
                for(int j = i + 1;j < S.length();j++){
                    int b1 = Character.getNumericValue(S.charAt(j));
                    if(!b[b1]){
                        b[b1] = true;
                        for(int k = j + 1;k < S.length();k++){
                            int c1 = Character.getNumericValue(S.charAt(k));
                            if(!c[c1]){
                                c[c1] = true;
                                res++;
                            }
                        }
                        for(int q = 0;q < 10;q++){
                            c[q] = false;
                        }
                    }
                }
                for(int q = 0;q < 10;q++){
                    b[q] = false;
                }
            }
        }
        
      	System.out.println(res);
    }
}
