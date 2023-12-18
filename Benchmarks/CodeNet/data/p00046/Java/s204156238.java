import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if ("q".equals(s)) {
                break;
            }
            list.add(Double.parseDouble(s));
        }

        double max = 0;
        double min = 999999999;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            } else if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println(max - min);
    }
}