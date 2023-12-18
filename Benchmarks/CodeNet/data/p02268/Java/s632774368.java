import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
//import java.io.*;
//import java.util.stream.IntStream;

public class Main {
    static int minR = Integer.MAX_VALUE;
    static int maxL = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
        // int n = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(sc.nextLine());
        int[] T = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int q = Integer.parseInt(sc.nextLine());
        int[] S = Arrays.stream(sc.nextLine().split(" ")).mapToInt((s) -> Integer.parseInt(s)).toArray();
        
        AtomicInteger count = new AtomicInteger();

        Arrays.stream(S)
            .forEach((elm)->{
                boolean flag = binarySearch(elm, T, 0, T.length);
                        if (flag) {
                            count.getAndIncrement();
                        }
                    });
        
        System.out.println(count);

        }

        public static boolean binarySearch(int elm, int[] T, int l, int r) {
        int m = (l + r) / 2;
        if(elm == T[m]){
            return true;
        }
        if(m == l){
            return false;
        }
        if(elm < T[m]){
            return binarySearch(elm, T, l, m);
        }else{
            return binarySearch(elm, T, m, r);
        }
    }
}
