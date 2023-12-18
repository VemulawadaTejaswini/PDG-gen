import java.util.HashSet;
import java.util.Scanner;

class SumInt{
    private int p;
    public void set(int l){
        p = l;
    }

    public int getCombi(int n, int s, HashSet<Integer> set){
        if (n == 1 || n == 0){
            if (((set.size() == 2 && !set.contains(0)) || set.size() == 3)){
                int sum = 0;
                for (int i: set) {
                    sum += i;
                }
                if (p == sum) {
                    //System.out.println(set);
                    return 1;
                }
            }
        }
        int add = 0;
        for (int i = (int) Math.ceil((double) s / 2); i <= s; i++) {
            if (!set.contains(i)) {
                HashSet<Integer> tmp = new HashSet<>(set);
                tmp.add(i);
                add += getCombi(n - 1, s-i, tmp);
            }
        }
        return add;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt(), s = sc.nextInt();
            if (n ==0 && s ==0)break;
            SumInt si = new SumInt();
            si.set(s);
            System.out.println(si.getCombi(n, s, new HashSet<>()));
        }
    }
}