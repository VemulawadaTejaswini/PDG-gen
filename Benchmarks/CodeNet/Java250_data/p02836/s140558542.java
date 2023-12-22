import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int count = 0;
        int L = N.length();
       
        for(int i=0; i<L; i++){
            if(N.charAt(i)!=N.charAt(L-1-i)){
                count = count + 1;
            }
        }
        
        System.out.println(count/2);
        
    }
}
