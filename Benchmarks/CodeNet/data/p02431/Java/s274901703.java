import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //命令の数
        ArrayList<Integer> a = new ArrayList<Integer>();
        int q;
        for (int i=0; i<n; i++) {
            q = sc.nextInt();
            if(q==0) pushBack(sc.nextInt(), a);
            else if(q==1) randomAccess(sc.nextInt(), a);
            else popBack(a);
        }
    }
    static void pushBack(int q, ArrayList<Integer> a) {
        a.add(q);
    }
    static void randomAccess(int q, ArrayList<Integer> a) {
        System.out.println(a.get(q));
    }
    static void popBack(ArrayList<Integer> a) {
        a.remove(a.size()-1);
    }
}

