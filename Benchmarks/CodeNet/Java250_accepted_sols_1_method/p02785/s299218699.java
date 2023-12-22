import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Integer[] h = new Integer[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        Arrays.sort(h, Comparator.reverseOrder());
        try{for(int i = 0; i < k; i++) h[i] = 0;}catch(Exception e){}
        long out = 0;
        for(int i = 0; i < n; i++) out += h[i];
        System.out.println(out);
        scan.close();
    }
}