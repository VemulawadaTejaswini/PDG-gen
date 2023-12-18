import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String w = sc.next();
        sc.close();
        
        int[] cnt = new int[26];
        for(int i = 0; i < w.length(); i++){
            cnt[(int)(w.charAt(i)-'a')]++;
        }
        for(int i = 0; i < 26; i++){
            if(cnt[i]%2 == 1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}