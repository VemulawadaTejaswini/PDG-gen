import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        boolean bool = true;
        if(n % 2 != 0){
            System.out.println("No");
            return;
        }
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n/2+i)){
                bool = false;
                break;
            }
        }
        if(bool){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

