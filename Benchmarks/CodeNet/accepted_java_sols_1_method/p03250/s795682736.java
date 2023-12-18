import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        ABC[0] = sc.nextInt();
        ABC[1] = sc.nextInt();
        ABC[2] = sc.nextInt();
        
        int max = 0;
        int maxI = -1;
        for(int i = 0; i < 3; i++){
            if( max < ABC[i] ){
                max = ABC[i];
                maxI = i;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < 3; i++){
            if( i == maxI ){
                ans += ABC[i] * 10;
            } else {
                ans += ABC[i];
            }
        }
        
        System.out.println( ans );
    }
}
