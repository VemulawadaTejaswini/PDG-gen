import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                Dice dice = new Dice();
                int sum = 1;
                for(int i = 0; i < n; i++) {
                    dice.move(scn.next());
                    sum += dice.showTop();
                }
                System.out.println(sum);
            }
        }
    }
}

interface DirectionValues {
    int TMP    = 0;
    int TOP    = 1;
    int FRONT  = 2;
    int RIGHT  = 3;
    int LEFT   = 4;
    int BACK   = 5;
    int BOTTOM = 6;
    int[] dirNorth = {TMP, TOP, FRONT, BOTTOM, BACK, TMP};
    int[] dirEast  = {TMP, TOP, LEFT, BOTTOM, RIGHT, TMP};
    int[] dirWest  = {TMP, TOP, RIGHT, BOTTOM, LEFT, TMP};
    int[] dirSouth = {TMP, TOP, BACK, BOTTOM, FRONT, TMP};
    int[] dirRight = {TMP, FRONT, RIGHT, BACK, LEFT, TMP};
    int[] dirLeft  = {TMP, FRONT, LEFT, BACK, RIGHT, TMP};
}

class Dice implements DirectionValues {
    private int[] nums;

    Dice() {
        int[] nums = new int[7];
        nums[TOP]    = 1;
        nums[FRONT]  = 2;
        nums[RIGHT]  = 3;
        nums[LEFT]   = 4;
        nums[BACK]   = 5;
        nums[BOTTOM] = 6;
        this.nums = nums;
    }

    int showTop() {
        return nums[TOP];
    }

    void move(String cmd) {
        switch(cmd) {
          case "North":
            rotate(dirNorth);
            break;
          case "East":
            rotate(dirEast);
            break;
          case "West":
            rotate(dirWest);
            break;
          case "South":
            rotate(dirSouth);
            break;
          case "Right":
            rotate(dirRight);
            break;
          case "Left":
            rotate(dirLeft);
            break;
          default:
            assert false;
        }
    }

    private void rotate(int[] dir) {
        for(int i = 0; i < 5; i++) {
            nums[dir[i]] = nums[dir[-~i]];
        }
    }
}