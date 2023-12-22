import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Double> list = new ArrayList<Double>();

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            list.add(new Double(v+""));
        }
        Collections.sort(list);

        double result = list.get(0);
        for(int i = 1; i < list.size() ; i++){
            Double v2 = list.get(i);
            result = (result + v2) / 2.0;
        }
        System.out.println(result);
    }
}
