import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        Dice dice1 = createDice(), dice2 = createDice();
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
    
    public int show(int side) {
        return num_[side];
    }
    
    public int[] showAll() {
        return num_;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean rslt = false;
        Dice dice = (Dice)obj;
        String str = "-RRRSRRRSRRRNRRRSRRRNRRR";
        for(char elm : str.toCharArray()) {
            move(elm);
            if(Arrays.equals(showAll(), dice.showAll())) {
                rslt = true;
                break;
            }
        }
        return rslt;
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