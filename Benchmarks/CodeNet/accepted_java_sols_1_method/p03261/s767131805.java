import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char last = 'a';
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            hs.add(s);
            if(last == s.charAt(0) || i == 0){
                last = s.charAt(s.length()-1);
            } else {
                System.out.println("No");
                return;
            }
        }
        if(n == hs.size()){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}