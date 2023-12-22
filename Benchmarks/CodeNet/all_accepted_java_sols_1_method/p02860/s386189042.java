import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        String str=s.next();
        if(str.length()%2==1){
            System.out.println("No");
            System.exit(0);
        }
        for(int i=0;i<N/2;i++){
            if(str.charAt(i)!=str.charAt(i+N/2)){
                System.out.println("No");
            System.exit(0);
            }
        }
        System.out.println("Yes");
        
    }
}