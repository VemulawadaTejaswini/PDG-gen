import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Integer min;
        Integer max = -2000000000;

        List<Integer> IntList = new ArrayList<Integer>();
        Scanner sc;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++) {
            IntList.add(Integer.parseInt(sc.next()));
        }

        min = IntList.get(0);
        for (int in = 1;in<IntList.size();in++) {
            max = Math.max(max,IntList.get(in) - min);
            min = Math.min(min,IntList.get(in));
        }

        System.out.println(max);

    }
}
