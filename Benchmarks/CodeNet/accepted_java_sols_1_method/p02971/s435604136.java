import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int max = 0;
        int max2 = 0;
        int pos = -1;

        for (int i = 0; i < n; i++){
            int temp = list.get(i);
            if (max < temp){
                max = temp;
                pos = i;
            }
        }

        for (int i = 0; i < n; i++){
            if (i == pos){
                continue;
            }
            int temp = list.get(i);
            if (max2 < temp){
                max2 = temp;
//                pos = i;
            }
        }

        for (int i = 0; i < n; i++){
            if (i != pos) {
                System.out.println(max);
            }else {
                System.out.println(max2);
            }
        }
    }
}
