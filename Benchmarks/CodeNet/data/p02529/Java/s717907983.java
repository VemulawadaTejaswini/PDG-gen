import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        printAnswer();
    }
 
    private static void printAnswer() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
 
            int n = Integer.valueOf(br.readLine());
            String[] S = br.readLine().split(" ");
            int q = Integer.valueOf(br.readLine());
            String[] T = br.readLine().split(" ");
            int count = 0;
 
            for(int i = 0; i < n; i++){
                for(int j = 0; j < q; j++){
                    System.out.println(S[i] + " - " + T[j]);
                    if(S[i].equals(T[j])){
                        count++;
                    }
                }
            }
           
            System.out.println(count);
 
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 
}