import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[26];
        Arrays.fill(array,0);
        char[] c_array;
        String str;
        do{
            if((str=br.readLine())==null) break;
            c_array=str.toCharArray();
            for(char c:c_array){
                if('a'<=c&&c<='z') array[c-'a']++;
                else if('A'<=c&&c<='Z') array[c-'A']++;
            }
        }while(true);
        for(int i=0;i<26;i++){
            System.out.println((char)('a'+i)+" : "+array[i]);
        }
    }
}