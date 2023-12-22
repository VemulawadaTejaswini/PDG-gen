import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Long> list = new ArrayList<Long>(n);
        int count = 0;

        for(int i = 0;i < n;i++) {
            list.add(scan.nextLong());
        }

        Collections.sort(list);

        for(int i = 0;i < n - 2;i++) {
            for(int j = i + 1;j < n - 1;j++) {
                for(int k = j + 1;k < n;k++) {
                    if(list.get(i).equals(list.get(j)) || list.get(j).equals(list.get(k)) || list.get(i).equals(list.get(k))) {
                        continue;
                    }

                    if(list.get(i) + list.get(j) > list.get(k) && list.get(j) + list.get(k) > list.get(i) && list.get(k) + list.get(i) > list.get(j)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
