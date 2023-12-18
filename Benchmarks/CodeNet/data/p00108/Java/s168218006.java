import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;

        n = in.nextInt();
        while(n != 0){
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            Pair p = solve(a);
            System.out.println(p.count);
            for(int i = 0; i < p.a.length; i++){
                if(i != 0){
                    System.out.print(" ");
                }
                System.out.print(p.a[i]);
            }
            System.out.println();
            n = in.nextInt();
        }
    }

    static Pair solve(int[] a){
        int[] b = new int[a.length];
        int count = -1;
        while(!Arrays.equals(a, b)){
            b = a.clone();
            for(int i = 0; i < a.length; i++){
                int t = 0;
                for(int j = 0; j < a.length; j++){
                    if(a[i] == b[j]) t++;
                }
                a[i] = t;
            }
            count++;
        }
        return new Pair(count, b);
    }
}

class Pair{
    int count;
    int[] a;
    public Pair(int count, int[] a){
        this.count = count;
        this.a = a;
    }
}