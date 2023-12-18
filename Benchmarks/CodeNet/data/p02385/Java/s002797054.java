import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        Dice dice1 = createDice(), dice2 = createDice();
        dice1.setTop(dice2.show(Dice.TOP));
        dice1.setSouth(dice2.show(Dice.SOUTH));
        System.out.println(dice1.equals(dice2) ? "Yes" : "No");
    }
    
    private static Dice createDice() {
        int[] num = new int[6];
        for(int i = 0; i < 6; i++) {
            num[i] = scn.nextInt();
        }
        return new Dice(num);
    }
}

class Dice {
    private int[] num_;
    public static final int
      TOP = 0, SOUTH = 1, EAST = 2,
      WEST = 3, NORTH = 4, BOTTOM = 5;
    
    public Dice(int... ary) {
        int[] num = new int[6];
        for(int i = 0; i < 6; i++) {
            num[i] = ary[i];
        }
        num_ = num;
    }
    
    @Override
    public boolean equals(Object obj) {
        Dice dice = (Dice)obj;
        return Arrays.equals(showAll(), dice.showAll());
    }
    
    public int show(int side) {
        return num_[side];
    }
    
    public int[] showAll() {
        return num_;
    }
    
    public void setTop(int num) {
        if(num_[TOP] != num) {
            if(num_[SOUTH] == num) {
                move('N');
            } else if(num_[EAST] == num) {
                move('W');
            } else if(num_[WEST] == num) {
                move('E');
            } else if(num_[NORTH] == num) {
                move('S');
            } else {
                move("SS");
            }
        }
    }
    
    public void setSouth(int num) {
        for(int i = 0; i < 4; i++) {
            if(num_[SOUTH] != num) {
                move('R');
            }
        }
    }
    
    public void move(String str) {
        char[] ary = str.toCharArray();
        for(char elm : ary) {
            move(elm);
        }
    }
    
    public void move(char dir) {
        if(dir == 'S') {
            toSouth();
        } else if(dir == 'E') {
            toEast();
        } else if(dir == 'W') {
            toWest();
        } else if(dir == 'N') {
            toNorth();
        } else if(dir == 'R') {
            toRight();
        } else if(dir == 'L') {
            toLeft();
        }
    }
    
    private void toSouth() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[NORTH];
        num_[NORTH]  = num_[BOTTOM];
        num_[BOTTOM] = num_[SOUTH];
        num_[SOUTH]  = tmp;
    }
    
    private void toEast() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[WEST];
        num_[WEST]   = num_[BOTTOM];
        num_[BOTTOM] = num_[EAST];
        num_[EAST]   = tmp;
    }
    
    private void toWest() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[EAST];
        num_[EAST]   = num_[BOTTOM];
        num_[BOTTOM] = num_[WEST];
        num_[WEST]   = tmp;
    }
    
    private void toNorth() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[SOUTH];
        num_[SOUTH]  = num_[BOTTOM];
        num_[BOTTOM] = num_[NORTH];
        num_[NORTH]  = tmp;
    }
    
    private void toRight() {
        int tmp      = num_[SOUTH];
        num_[SOUTH]  = num_[WEST];
        num_[WEST]   = num_[NORTH];
        num_[NORTH]  = num_[EAST];
        num_[EAST]   = tmp;
    }
    
    private void toLeft() {
        int tmp      = num_[SOUTH];
        num_[SOUTH]  = num_[EAST];
        num_[EAST]   = num_[NORTH];
        num_[NORTH]  = num_[WEST];
        num_[WEST]   = tmp;
    }
}