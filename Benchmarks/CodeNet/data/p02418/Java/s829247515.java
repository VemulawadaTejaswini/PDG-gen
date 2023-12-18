
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            String ans =  null;
            int[] wordlist = new int[26];
            int[] wordlist2 = new int[26];

            // alphabet List
            char[] alphabet = new char[26];
            char word = 'a';
            for (int x = 0; x <= ('z') - ('a'); x++) {
                alphabet[x] = word++;
            }
            // wordlist ??? Array?????\?????????????????????
            //????±???????????????????????????°??????????????§??????
            String words = reader.readLine();
            for (int j = 0 ; j < words.length(); j++ ) {
                for (int i = 0 ; i < 26 ; i++ ) {
                   if (words.charAt(j) == alphabet[i]) {
                        wordlist[i]++;
                   }
                }
            }
            // wordlist2???Array?????\??????
            words = reader.readLine();
            for (int i = 0 ; i < 26 ; i++ ) {
            // ?????§??????
                for (int j = 0 ; j < words.length(); j++ ) {
                   if (words.charAt(j) == alphabet[i]) {
                       wordlist2[i]++;
                    }
                }
            }
            ans = "Yes";
             for (int i = 0 ; i < 26 ; i++ ) {
                if (wordlist2[i] >= 0){
                    if (wordlist2[i] > wordlist[i] ){
                        ans = "No";
                    }
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
           
        }
    }
}