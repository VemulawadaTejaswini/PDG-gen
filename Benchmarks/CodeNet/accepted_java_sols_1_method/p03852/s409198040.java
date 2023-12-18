import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // long n = Long.parseLong(st.nextToken());
        String c = br.readLine();
        if(c.charAt(0)=='a' || c.charAt(0)=='e' || c.charAt(0)=='i'|| c.charAt(0)=='o'|| c.charAt(0)=='u')
            System.out.println("vowel");
        else
            System.out.println("consonant");



        
    }
}
