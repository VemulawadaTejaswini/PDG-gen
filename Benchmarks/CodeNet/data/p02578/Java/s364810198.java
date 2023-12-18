import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = Integer.parseInt(sn.next());
        int sum = 0;
        int bef = 0;
        int aft = 0;
        for ( int i = 0; i < n; i++){
            aft = Integer.parseInt(sn.next());
            if ( bef > aft ){
                sum = sum + (bef - aft);
            }else {
	            bef = aft;
            }
          
        }
        System.out.println(sum);
    }
}
