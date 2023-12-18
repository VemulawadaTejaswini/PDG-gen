import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String s=br.readLine();

        int score=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='g'){
                if(i%2==1)
                    score++;
            }
            if(s.charAt(i)=='p'){
                if(i%2==0)
                    score--;
            }

        }
        
    

        System.out.println(score);
    }
}