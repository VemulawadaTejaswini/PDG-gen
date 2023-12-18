import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> ascList = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)){
            int cnt = sc.nextInt();
            int[] array = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                array[i] = sc.nextInt();
                ascList.add(array[i]);
            }
            Collections.sort(ascList);
            int diffCnt = 0;
            for(int i =0; i < array.length;i++){
                if (array[i] != ascList.get(i)) diffCnt++;
                if (diffCnt > 2) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
