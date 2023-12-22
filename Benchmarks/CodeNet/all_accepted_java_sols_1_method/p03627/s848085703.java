import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        long x = 0;
        long y = 0;
        int c = 0;

        for(;c < n - 1; c++){
            if(a[c].equals(a[c + 1])){
                x = a[c];
                c += 2;
                break;
            }
        }
        for(;c < n - 1; c++){
            if(a[c].equals(a[c + 1])){
                y = a[c];
                break;
            }
        }

        System.out.println(x * y);

    }
}
