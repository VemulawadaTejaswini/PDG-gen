import java.util.*;
import java.util.Arrays;

public class Main {
    
    static boolean check(int[] a, int x, int n, char c){
        for(int i=0;i<26;i++){
            if(i != c - 'A'){
                a[i] += (n - x);
            }
        }
        for(int i=0;i<26;i++){
            if(i != c - 'A' && a[i] >= a[c - 'A']) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] kouho = new int[26];
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            for(int i=0;i<26;i++){
                kouho[i] = 0;
            }
            String v = sc.next();
            System.out.println(v);
            for(int i=0;i<n;i++){
                char c = v.charAt(i*2);
                kouho[c - 'A'] ++;
                if(check(kouho, i+1, n, c)){
                    System.out.println(c + " " + i+1);
                }
            }
            System.out.println("TIE");
        }
    }
}

