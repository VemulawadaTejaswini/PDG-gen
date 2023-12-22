import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split("");
        String[] T = sc.nextLine().split("");
        
        int count = 0; 
        
        for (int i = 0; i < 3; i++) {
            
            if (Arrays.asList(S[i]).contains(T[i])) {
                count++;
            }
            
        }
        System.out.println(count);

    }
}