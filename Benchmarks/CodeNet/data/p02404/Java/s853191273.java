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
            for(int i = 0; i < W.get(k); i++){
                System.out.print("#");
            }
            System.out.println();
            for (int i = 1; i < H.get(k) - 1; i++) {
                System.out.print("#");
                for (int j = 1; j < W.get(k) - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println();
            }
            for(int i = 0; i < W.get(k); i++){
                System.out.print("#");
            }
            System.out.println();
            System.out.println();
        }

        sc.close();
    }
}
