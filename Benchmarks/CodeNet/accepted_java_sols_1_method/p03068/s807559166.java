import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = sc.next();
        String str [] = line.split("");
        int k = sc.nextInt();
        String letter = str[k-1];
        for(int i = 0; i < n; i++){
            
            if(!str[i].equals(letter)){
                str[i] = "*";
            }
            System.out.print(str[i]);
            
        }
        System.out.println("");
        
        
    }
}
