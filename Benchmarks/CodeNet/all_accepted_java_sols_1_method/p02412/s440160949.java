import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        int tempn, tempx;
        int count;

        while (true) {
            tempn = sc.nextInt();
            tempx = sc.nextInt();

            if (tempn == 0 && tempx == 0)
                break;

            n.add(tempn);
            x.add(tempx);
        }

        for (int m = 0; m < n.size(); m++) {
            count = 0;
            for(int i = 1; i <= n.get(m); i++){
                for(int j = i + 1; j <= n.get(m); j++){
                    for(int k = j + 1; k <= n.get(m); k++){
                        if(i + j + k == x.get(m)) count++;
                    }
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
