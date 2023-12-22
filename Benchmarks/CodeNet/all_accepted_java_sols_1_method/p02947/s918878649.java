import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long count = 0;
        String words[] = new String[n];
        
        for(int i = 0; i < n; i++){
            String s = stdIn.next();
            char c[] = s.toCharArray();
            Arrays.sort(c);
            words[i] = String.valueOf(c);
        }
        
        Arrays.sort(words);
        
        for(int i = 0; i < n - 1; i++){
            int num = 0;
            for(int j = i + 1; j < n; j++){
                if(words[i].equals(words[j])){
                    count++;
                    num++;
                }else{
                    break;
                }
            }
            
            if(num != 0){
                for(int j = num - 1; j >= 1; j--){
                    count = count +  j; 
                }
                i += num;
            }
        }
        
        System.out.println(count);
    }
}
