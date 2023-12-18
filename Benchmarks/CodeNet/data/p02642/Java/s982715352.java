import java.util.*;

public class Main {

    static List<Integer> divisor(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                list.add(i);
                if (i*i!=n) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }

        int cnt = 0;
        for (int i=0;i<N;i++) {
            if (map.get(A[i])>1) {
                map.put(A[i], map.get(A[i])-1);
            } else {
                map.remove(A[i]);
            }

            ArrayList<Integer> div = new ArrayList<Integer>(divisor(A[i]));
            boolean flag = false;
            for (Integer element : div) {
                if (map.containsKey(element)) flag = true;
            }
            if (!flag) cnt++;

            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }
        System.out.println(cnt);
    }
}