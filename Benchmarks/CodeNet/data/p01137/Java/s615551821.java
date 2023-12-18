
import java.util.Scanner;

/**
 * Created by Reopard on 2014/07/03.
 */
public class Main{
    public static void main(String[] args){
        int x, y, z, e, m, min;

        Scanner scan = new Scanner(System.in);
        while((e = scan.nextInt()) != 0){
            min = Integer.MAX_VALUE;
            for(z = 0; z*z*z <= e; ++z){
                for(y = 0; y*y + z*z*z <= e; ++y){
                    for(x = 0; x + y*y + z*z*z <= e; ++x){
                        if(x + y*y + z*z*z == e){
                            m = x + y + z;
                            min = Math.min(m, min);
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
}