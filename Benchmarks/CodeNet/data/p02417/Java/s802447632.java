import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[26];
        for(int i = 0; i<26; i++) sum[i] = 0;
        while(sc.hasNextLine()){
        String S = sc.nextLine();
        String LS = S.toLowerCase();
        
        
        for(int i = 0; i<LS.length(); i++){
            char c = LS.charAt(i);
            if(c >= 97 && c<=122){
            sum[c-97]++;
            }
        }
        }
        for(int i = 0; i<26; i++){
            System.out.printf("%c : %d\n", i+97, sum[i]);
        }
        sc.close();
    }
}
