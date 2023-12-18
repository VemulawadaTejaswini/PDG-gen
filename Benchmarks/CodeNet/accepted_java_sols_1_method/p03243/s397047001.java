import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String strN = Integer.toString(N);
        
        String first = strN.substring(0,1);
        int fnum = Integer.valueOf(first);
        int compare = Integer.valueOf(first + first + first);
        
        if( compare >= N){
            System.out.println(compare);
        }else{
            String second = String.valueOf(fnum+1) + String.valueOf(fnum+1) + String.valueOf(fnum+1);
            System.out.println( second );
        }
        
        
        
    }
}
