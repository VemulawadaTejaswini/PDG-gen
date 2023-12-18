import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        init(n);
        for (int i=0;i<q;i++) {
            if(in.nextInt()==0) {
                add(in.nextInt(), in.nextInt());
            }
            else {
                System.out.println(sum(in.nextInt(), in.nextInt()));
            }
        }
    }
     static int[] nodes;
    static int size;
    static void init(int n) {
        size=1;
        while (size<n)
            size*=2;
        nodes = new int[size+1];
    }
    static void add(int target, int value) {
        while (target<nodes.length) {
            nodes[target] += value;
            target += target&(-target);
        }
    }
    static int sum(int s, int t) {
        return sum(t) - sum(s-1);
    }
    static int sum(int t) {
        int res=0;
        while (t>0) {
            res += nodes[t];
            t -= t&(-t);
        }
        return res;
    }
}
