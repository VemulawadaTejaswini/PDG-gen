import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }

        long sumAll = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            long value = (long)e.getValue();
            sumAll+= (value*(value-1))/2;
        }

        for (int i = 0; i < n; i++) {
            long sol = 0;
            long v = map.get(ar[i]);
            long t = (v*(v-1))/2;
            long p = ((v-1)*(v-2))/2;
            sol= sumAll - t + p;
            System.out.println(sol);
        }
//        for (int i = 0; i < n; i++) {
//            long sol = 0;
//            for(Map.Entry<Integer,Integer> e : map.entrySet()){
//                long x = e.getValue();
//                if(ar[i] == e.getKey()){
//                    sol+=((x-1) * (x-2))/2;
//                }else{
//                    sol+=(x*(x-1))/2;
//                }
//            }
//            System.out.println(sol);
//        }
    }
}