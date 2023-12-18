import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int p=0;

        //haveListに入れる
        while (true) {

            List<Integer> haveStoneList = new ArrayList<>();

            //String[] data = s.split(" ");
            n = sc.nextInt();
            p = sc.nextInt();
            if(n==0&&p==0)break;

            for (int j = 0; j < n; j++) {
                haveStoneList.add(0);
            }
            int i = 0;
            int wan = p;

            while (true) {
                if (haveStoneList.get(i) == p) {
                    System.out.println(i);
                    break;
                }

                if (wan == 0) {
                    wan += haveStoneList.get(i);
                    haveStoneList.set(i, 0);
                } else {
                    haveStoneList.set(i, haveStoneList.get(i) + 1);
                    wan -= 1;
                }
                if (i == n - 1) {
                    i = 0;
                } else {
                    i++;
                }

            }
        }

    }

}
