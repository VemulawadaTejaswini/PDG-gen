import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());

        Map<Integer, Boolean> map = new HashMap<>(k);

        for (int i = 1; i <= k; i++) {

            int d = Integer.parseInt(scan.next());

            for (int j = 1; j<= d; j++) {


                int a = Integer.parseInt(scan.next());

                if (!map.containsKey(a)) {
                    map.put(a, true);
                }
            }
        }
        scan.close();

       int x= n-  map.size();

       System.out.println(String.valueOf(x));
    }
}