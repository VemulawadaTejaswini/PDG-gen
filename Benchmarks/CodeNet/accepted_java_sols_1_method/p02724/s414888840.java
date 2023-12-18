

import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(n/500*1000+(n%500)/5*5);
    }

}
