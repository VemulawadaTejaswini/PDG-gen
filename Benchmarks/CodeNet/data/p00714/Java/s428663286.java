import java.util.*;

class WaterTankBlock implements Cloneable, Comparable<WaterTankBlock> {
    static final int DEPTH = 30;

    double lp = 0, lh = 50, rp = 100, rh = 50, wps = 0, qty = 0;
    
    WaterTankBlock(double _lp, double _lh, double _rp, double _rh) {
        lp = _lp; lh = _lh; rp = _rp; rh = _rh;
    }

    @Override
    public WaterTankBlock clone(){
        WaterTankBlock b = null;

        try {
            b = (WaterTankBlock)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;
    }
    @Override
    public int compareTo(WaterTankBlock block) { return (int)(this.lp - block.lp); }
    
    void union(WaterTankBlock b) {

        if (rp == b.lp) {
            rp = b.rp; rh = b.rh; wps += b.wps; qty += b.qty;
        } else if (b.rp == lp) {
            lp = b.lp; lh = b.lh; wps += b.wps; qty += b.qty;
        }
    }

    double width() { return rp - lp;}
    double minHeight() { return (lh < rh) ? lh : rh; }
    double capacity() { return width() * minHeight() * DEPTH; }
    double waterLever() { return Math.min(50, qty/(width()*DEPTH)); }

    int flowTo() { if (lh > rh) return 1; else return -1; }
    void pourWater(double t) { qty += t * wps; }
    boolean isOver() { return qty > capacity(); }
}

class WaterTank {
    static Scanner sc = new Scanner(System.in);
    private static List<WaterTankBlock> _blocks = new LinkedList<>();
    private List<WaterTankBlock> blocks = new LinkedList<>();

    WaterTank() {
        int n, i;
        _blocks.clear();

        n = sc.nextInt();
        double b, h, preB = 0, preH = 50;
        for (i = 0; i < n; i++) {
            b = sc.nextDouble(); h = sc.nextDouble();
            _blocks.add(new WaterTankBlock(preB, preH, b, h));
            preB = b; preH = h;
        }
        _blocks.add(new WaterTankBlock(preB, preH, 100, 50));
        
        n = sc.nextInt();
        double f, a;
        for (i = 0; i < n; i++) {
            f = sc.nextDouble(); a = sc.nextDouble();
            for (WaterTankBlock block : _blocks) {
                if (block.lp < f && f < block.rp) {
                    block.wps += a;
                    break;
                }
            }
        }
        
        n = sc.nextInt();
        double p, t;
        for (i = 0; i < n; i++) {
            blocks.clear();
            for (WaterTankBlock block : _blocks) {
                blocks.add(block.clone());
            }

            p = sc.nextDouble(); t = sc.nextDouble();
            calcWaterLevel(p, t);
        }
    }

    void calcWaterLevel(double p, double t) {
        for (WaterTankBlock block : blocks) block.pourWater(t);

        while (true) {
            boolean shouldStop = true;
            for (int i = 0; i < blocks.size(); i++) {
                WaterTankBlock now = blocks.get(i);
                if (now.isOver()) {
                    shouldStop = false;
                    int nextI = i + now.flowTo();
                    WaterTankBlock next = blocks.get(nextI);
                    if (next.capacity() == next.qty && nextI + next.flowTo() == i) {
                        now.union(next);
                        blocks.remove(nextI);
                        break;
                    } else {
                        next.qty += now.qty - now.capacity();
                        now.qty = now.capacity();
                        break;
                    }
                }
            }
            if (shouldStop) break;
            if (blocks.size() == 1) break;
        }
        for (WaterTankBlock block : blocks) {
            if (block.lp < p && p < block.rp) {
                System.out.println(block.waterLever());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int D;
        D = WaterTank.sc.nextInt();

        for (int d = 0; d < D; d++) {
            new WaterTank();
        }
    }
}