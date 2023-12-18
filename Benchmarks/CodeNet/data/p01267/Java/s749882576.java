import java.util.*;

class ManipulationException extends RuntimeException {}

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        while((n = scn.nextInt()) > 0) {
            String[] prm = scn.nextLine().trim().split(" ");
            String[] ary = scn.nextLine().split(" ");
            Memory mem = new Memory(
              Integer.parseInt(prm[0]), Integer.parseInt(prm[1]),
              Integer.parseInt(prm[2]), Integer.parseInt(prm[3])
            );
            try {
                for(int i = 0; i < n; i++) {
                    int y = Integer.parseInt(ary[i]);
                    while(mem.isDiff(y)) {
                        mem.nextFrame();
                    }
                    mem.nextFrame();
                }
                System.out.println(mem.showFrame());
            } catch(ManipulationException e) {
                System.out.println("-1");
            }
        }
    }
}

class Memory {
    private int frame_, x_;
    private final int a_, b_, c_;
    
    public Memory(int a, int b, int c, int x) {
        frame_ = -1;
        a_ = a;
        b_ = b;
        c_ = c;
        x_ = x;
    }
    
    public void nextFrame() throws ManipulationException {
        if(++frame_ > 10000) {
            throw new ManipulationException();
        }
        x_ = (a_ * x_ + b_) % c_;
    }
    
    public int showFrame() {
        return frame_;
    }
    
    public boolean isDiff(int y) {
        return x_ != y;
    }
}