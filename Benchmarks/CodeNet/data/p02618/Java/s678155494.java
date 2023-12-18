import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int c[] = new int[n];
        int s[][] = new int[n][26];
        
        for(int i = 0; i < n; i++){
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
            System.out.println(index);
        }
        
        for(int i = 0; i < n; i++){
            System.out.println((int)(Math.random() * 25 + 1));
        }
        
        
        //System.out.println("XXXXXXXX");
    }
}
