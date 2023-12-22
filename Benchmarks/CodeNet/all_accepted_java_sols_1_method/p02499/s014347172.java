import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        int alphabet[] = new int[26];
        while((str=reader.readLine()) != null){
            for(int i=0; i<str.length(); i++){
                n = Character.toLowerCase(str.charAt(i)) - 'a';
                if(0<=n && n<=26)
                    alphabet[n]++;
            }
        }
        for(int i=0; i<26; i++){
            System.out.println((char)(i+'a') + " : " + alphabet[i]);
        }
    }
}