import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        call(n);
    }
    
    static void call(int n){
        for(int i=1;i<=n;i++){
            if(check(i)) System.out.print(" "+i);
        }System.out.println();
    }
    
    static boolean check(int n){
        if(n>=10){
            char[] c=String.valueOf(n).toCharArray();
            for(char checker:c){
                if(checker=='3'){
                    return true;
                }
            }
        }if(n%3==0) return true;
        return false;
    }
}