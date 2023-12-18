import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        Integer[] l = new Integer[n];
        l[0] = a[0];
        int length = 1;
        for(int i = 1; i < n; i++){
            if(l[length-1] < a[i]){
                l[length] = a[i];
                length++;
            }else{
                int j = lowerBound(l, 0, length, a[i]);
                l[j] = a[i];
            }
        }
        System.out.println(length);
    }
    
    static int lowerBound(Integer[] a, int from, int to, int key){
        return ~Arrays.binarySearch(a, from, to, key, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
    }
}
