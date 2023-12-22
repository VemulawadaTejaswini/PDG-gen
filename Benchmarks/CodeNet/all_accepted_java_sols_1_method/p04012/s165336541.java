import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int[] c = new int[26];

        for (int i=0; i<w.length(); i++) {
            c[w.charAt(i)-'a']++;
        }
        String ans = "Yes";
        for (int i=0; i<26; i++) {
            if(c[i]%2!=0){
                ans = "No";
                break;
            }
        }

        System.out.println(ans);

    }
}