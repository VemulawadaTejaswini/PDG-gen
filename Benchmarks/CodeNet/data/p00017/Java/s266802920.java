import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int poor='t'-s.charAt(0);
        for(int i=0;i<s.length();i++){
            if('a'<=s.charAt(i)&&s.charAt(i)<='z'){
                System.out.printf("%c",s.charAt(i)+poor);
            }else System.out.print(s.charAt(i));
        }System.out.println();
    }
}