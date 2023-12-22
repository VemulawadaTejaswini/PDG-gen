import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        char a = 'a';
        int[] table = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null){
            sb.append(line);
        }
        String lines = new String(sb);
        char[] arr = lines.toLowerCase().toCharArray();
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<26; j++){
                if(arr[i]==(char)(a+j)){
                    table[j] += 1;
                    break;
                }
            }
        }
        
        for(int i=0; i<26; i++) {
            System.out.println((char)(a+i) + " : " + String.valueOf(table[i]));
        }
    }
}

