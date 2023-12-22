import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] a = new int[26];
        for(int i = 0; i < w.length(); i++){
            for(int j = 0; j < 26; j++){
                if(w.charAt(i) == alp[j]){
                    a[j]++;
                    break;
                }
            }
        }
        boolean b = true;
        for(int i = 0; i < 26; i++){
            if(a[i] % 2 == 1){
                b = false;
                break;
            }
        }
        if(b == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
