import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int c[] = new int[26];
        int s[][] = new int[n][26];
        
        for(int i = 0; i < 26; i++){
            c[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            int max = 0;
            int index = 0;
            for(int j = 0; j < 26; j++){
                s[i][j] = stdIn.nextInt();
                
                if(s[i][j] > max){
                    max = s[i][j];
                    index = j;
                }
            }
            System.out.println(index + 1);
        }
        
        //System.out.println("XXXXXXXX");
    }
}
