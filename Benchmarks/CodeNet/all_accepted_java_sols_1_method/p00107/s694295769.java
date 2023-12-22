import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
    public static Scanner sc;
    public static ArrayList<Integer> list;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        while (sc.hasNext()) {
            list = new ArrayList<>();
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            
            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                break;
            }
            
            Collections.sort(list);
            
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                double r = sc.nextDouble();
                double d = Math.sqrt(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2));
                
                //System.out.println(r + " " + d);
                
                if (r*2 > d) {
                    System.out.println("OK");
                } else {
                    System.out.println("NA");
                }
            }
        }
    }
}