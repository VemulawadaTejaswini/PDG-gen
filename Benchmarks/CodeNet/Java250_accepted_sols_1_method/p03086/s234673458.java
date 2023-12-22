import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxresult = 0;
        int kari = 0;
        for(int i = 0;i < s.length();i++){
            char a = s.charAt(i);
            if(a=='A'||a=='C'||a=='G'||a=='T'){
                kari += 1;
            }else{
                if(kari>maxresult){
                    maxresult = kari;
                    kari = 0;
                }
            }
        }
        if(kari>maxresult){
            maxresult = kari;
            kari = 0;
        }
        System.out.println(maxresult);
        sc.close();
    }
}