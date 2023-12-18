import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                char c;
                int[] dice = {1,2,6,5,4,3};
                int sum=dice[0];
                int n = Integer.parseInt(br.readLine());
                if(n==0){
                    break;
                }
                for (int i = 0; i < n; i++) {
                    c = br.readLine().charAt(0);
                    switch (c) {
                        case 'N':
                            dice = n(dice);
                            break;
                        case 'E':
                            dice = e(dice);
                            break;
                        case 'W':
                            dice = w(dice);
                            break;
                        case 'S':
                            dice = s(dice);
                            break;
                        case 'R':
                            dice = r(dice);
                            break;
                        case 'L':
                            dice = l(dice);
                            break;
                    }
                    sum += dice[0];
                }
                System.out.println(sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static int[] n(int[] dice){
        int[] ret = dice.clone();
        ret[0] = dice[1];
        ret[1] = dice[2];
        ret[2] = dice[3];
        ret[3] = dice[0];
        return ret;
    }

    static int[] e(int[] dice){
        int[] ret = dice.clone();
        ret[0] = dice[4];
        ret[5] = dice[0];
        ret[2] = dice[5];
        ret[4] = dice[2];
        return ret;
    }

    static int[] w(int[] dice){
        int[] ret = dice.clone();
        ret[0] = dice[5];
        ret[5] = dice[2];
        ret[2] = dice[4];
        ret[4] = dice[0];
        return ret;
    }

    static int[] s(int[] dice){
        int[] ret = dice.clone();
        ret[0] = dice[3];
        ret[1] = dice[0];
        ret[2] = dice[1];
        ret[3] = dice[2];
        return ret;
    }

    static int[] r(int[] dice){
        int[] ret = dice.clone();
        ret[1] = dice[5];
        ret[4] = dice[1];
        ret[3] = dice[4];
        ret[5] = dice[3];
        return ret;
    }

    static int[] l(int[] dice){
        int[] ret = dice.clone();
        ret[1] = dice[4];
        ret[4] = dice[3];
        ret[3] = dice[5];
        ret[5] = dice[1];
        return ret;
    }
}