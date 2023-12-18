import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        List<Long> list = new ArrayList<>();
        for(long i=0; i*i*i*i*i >=0; i++) {
            list.add(i*i*i*i*i);
        }
        int n = list.size();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = list.get(i);
        }

        for(int i=0; i<n; i++) {
            long b5 = a[i]-x;
            if(b5 > 0) {
                int j = Arrays.binarySearch(a, b5);
                if(j >= 0) {
                    int aa = i;
                    int bb = j;
                    System.out.println(aa + " " + bb);
                    return;
                }
            } else {
                int j = Arrays.binarySearch(a, -b5);
                if(j >= 0) {
                    int aa = i;
                    int bb = -j;
                    System.out.println(aa + " " + bb);
                    return;
                }
            }
            b5 = -a[i] - x;
            int j = Arrays.binarySearch(a, -b5);
            if(j >= 0) {
                int aa = -i;
                int bb = -j;
                System.out.println(aa + " " + bb);
                return;
            }
        }

    }



}