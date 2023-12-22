import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int sum =0;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int p = scan.nextInt();
            list.add(i, p);
        }

        Collections.sort(list);

        for (int j =0; j<k; j++) {
            sum += list.get(j);
        }

        System.out.println(sum);

    }

}