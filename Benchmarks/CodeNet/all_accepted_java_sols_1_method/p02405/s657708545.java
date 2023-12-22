import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> H = new ArrayList<Integer>();
        ArrayList<Integer> W = new ArrayList<Integer>();
        int tempH, tempW;

        while (true) {
            tempH = sc.nextInt();
            tempW = sc.nextInt();
            if (tempH == 0 && tempW == 0)
                break;

            H.add(tempH);
            W.add(tempW);
        }

        for (int k = 0; k < H.size(); k++) {
            for (int i = 0; i < H.get(k); i++) {
                for (int j = 0; j < W.get(k); j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
