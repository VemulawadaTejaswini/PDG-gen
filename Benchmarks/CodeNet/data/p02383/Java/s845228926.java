import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int[] dice = new int[6];
        int tmp = 0;

        for(int i = 0; i < 6; i++) {
          dice[i] = Integer.parseInt(l[i]);
        }

        line = sc.nextLine();
        char[] com = line.toCharArray();
        for(int i = 0; i < com.length; i++) {
          if(com[i] == 'N') {
            //1 <= 2, 2 <= 6, 6 <= 5, 5 <= 1
            tmp = dice[0]; dice[0] = dice[1]; dice[1] = dice[5]; dice[5] = dice[4]; dice[4] = tmp;
          } else if(com[i] == 'E') {
            //1 <= 4, 4 <= 6, 6 <= 3, 3 <= 1
            tmp = dice[0]; dice[0] = dice[3]; dice[3] = dice[5]; dice[5] = dice[2]; dice[2] = tmp;
          } else if(com[i] == 'W') {
            //1 <= 3, 3 <= 6, 6 <= 4, 4 <= 1
            tmp = dice[0]; dice[0] = dice[2]; dice[2] = dice[5]; dice[5] = dice[3]; dice[3] = tmp;
          } else if(com[i] == 'S') {
            //1 <= 5, 5 <= 6, 6 <= 2, 2 <= 1
            tmp = dice[0]; dice[0] = dice[4]; dice[4] = dice[5]; dice[5] = dice[1]; dice[1] = tmp;   
          }
        }

        System.out.println(dice[0]);
    }
}