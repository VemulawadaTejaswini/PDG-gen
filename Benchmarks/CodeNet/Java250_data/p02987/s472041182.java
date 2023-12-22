import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        char b[] = new char[4];
        b[0] = a.charAt(0);
        b[1] = a.charAt(1);
        b[2] = a.charAt(2);
        b[3] = a.charAt(3);
        
        Arrays.sort(b);
        
        if(b[0]==b[1] && b[1]!=b[2] && b[2] == b[3]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
