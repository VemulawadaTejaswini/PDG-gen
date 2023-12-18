import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        Long[] a, b;
        a = new Long[n];
        b = new Long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        Integer simeIdx[] = new Integer[n];
        Arrays.setAll(simeIdx, i -> i);
        Arrays.sort(simeIdx, Comparator.comparingLong(i -> b[i]));

        Long time = 0L;
        boolean canClear = true;
        for(int i = 0; i < n; i++){
            time += a[simeIdx[i]];
            if(time > b[simeIdx[i]]){
                canClear = false;
                break;
            }
        }

        if(canClear){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}