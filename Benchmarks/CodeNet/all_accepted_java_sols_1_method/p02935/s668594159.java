import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    /**
     * @param args
     */
/**
 * @author shirai_a
 *
 */
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Double> intlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        for (String str: sc.nextLine().split(" ")){
            intlist.add(Double.parseDouble(str));
          }
            sc.close();
        Collections.sort(intlist);
        double tr = intlist.get(0);
        for(int i = 1; i < intlist.size(); i++) {
            tr = (tr + intlist.get(i))/2;
        }
        System.out.println(tr);
    }
}

