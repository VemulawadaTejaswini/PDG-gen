

import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = scanner.next();
        int c = scanner.nextInt();

        if(b.equals("+") == true){
            System.out.println(a + c);
        }else
            System.out.println(a - c);


    }





}


