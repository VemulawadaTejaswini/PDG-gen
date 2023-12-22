import java.math.BigInteger;
import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] map = {1,2,4,8,16,32,64,122};


        if(a == 1){
            System.out.println(1);
        }else{
            for (int i = 0; i < 8; i++) {
                if(a < map[i]){
                    System.out.println(map[i - 1]);
                    break;
                }
            }
        }



    }


} // MainClass
