import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int count = 0;
        
        for(int i=0; i<N-2; i++){
            if(S.substring(i,i+3).equals("ABC")){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
