import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        int count = 0;
        for(int i = 0; i < 3; i++){
            for(int j = i + 1; j < 4; j++){
                if( line.charAt(i) == line.charAt(j) ) count++;
            }
        }
        
        System.out.println( (count == 2) ? "Yes" : "No" );
    }
}
