import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int len = s.length;
        int Ccnt = 0;
        if(s[0] != 'A'){
            System.out.println("WA");
            return;
        }
        for(int i = 1; i < len; i++){
            if(i == 1 || i == len-1){
                if(s[i] == 'C'){
                    System.out.println("WA");
                    return;
                }
            }
            if(s[i] == 'C'){
                Ccnt++;    
            } else {
                String s1 = String.valueOf(s[i]);
                String s2 = String.valueOf(s[i]).toLowerCase();
                if(!s1.equals(s2)){
                    System.out.println("WA");
                    return;
                }
            }
        }
        if(Ccnt == 1){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
        
    }
}