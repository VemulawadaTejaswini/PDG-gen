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
                int z3 = z*z*z;
                for(y = 0; y*y + z3 <= e; ++y){
                    int y2 = y*y;
                    for(x = 0; x + y2 + z3 <= e; ++x){
                        if(x + y2 + z3 == e){
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