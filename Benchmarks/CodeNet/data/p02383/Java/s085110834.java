import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice();
        int[] A = {1, 2, 3};

        for (int i=0; i<6; i++) {
            dice.d[i] = sc.nextInt();
        }
        sc.nextLine();

        String com = sc.nextLine();

        for (int i=0; i<com.length(); i++) {
            A = dice.Roll(com.substring(i, i+1), A[0], A[1], A[2]);
            //System.out.println(dice.d[A[0]-1]);
            //System.out.println(A[0]);
        }

        System.out.println(dice.d[A[0]-1]);
        //System.out.println(A[0]);

    }
}

class Dice {
    int[] d = new int[6];

    public int[] Roll(String com, int x, int y, int z) {
        int R[] = new int[3];
        if (com.equals("S")) {
            R[0] = 7 - y;
            R[1] = x;
            R[2] = z;
            return R;
        }
        else if (com.equals("N")) {
            R[0] = y;
            R[1] = 7 - x;
            R[2] = z;
            return R;
        }
        else if (com.equals("W")) {
            R[0] = z;
            R[1] = y;
            R[2] = 7 - x;
            return R;
        }
        else if (com.equals("E")) {
            R[0] = 7 - z;
            R[1] = y;
            R[2] = x;
            return R;
        }
        return R;
    }

}
