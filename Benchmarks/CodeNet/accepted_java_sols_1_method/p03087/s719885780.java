import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] ls = new int[q];
        int[] rs = new int[q];
        for(int i = 0; i < q; i++) {
            ls[i] = sc.nextInt()-1;
            rs[i] = sc.nextInt()-1;

        }
        int count = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'A' && s.charAt(i+1) == 'C') {
                map.put(i, count);
                count++;
            }
        }
        for(int i = 0; i < q; i++) {
            int start = ls[i];
            int end = rs[i];
            Integer start1 = map.ceilingKey(start);
            Integer start2 = map.floorKey(end-1);
            if(start1 == null || start2 == null) {
                System.out.println(0);
            } else {
                System.out.println(map.get(start2) - map.get(start1) + 1);
            }
        }
    }
}
