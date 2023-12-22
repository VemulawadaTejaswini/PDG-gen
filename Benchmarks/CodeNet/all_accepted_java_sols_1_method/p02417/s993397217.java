import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str,str1;
        int n[] = new int[26];
        char c = 'a';
        while((str = br.readLine())!=null){
            str1 = str.toLowerCase();
            for(int i=0;i<str1.length();i++){
                int a = str1.charAt(i);
                if(Character.isAlphabetic(a)){
                    n[a-c]++;
                }
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.println(c++ +" : "+n[i]);
        }
    }
}