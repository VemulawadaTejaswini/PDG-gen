import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int[] a = new int[10];
            for(int i=1; i<=4; i++) a[sc.nextInt()] = i;
            int hit = 0;
            int blow = 0;
            for(int i=1; i<=4; i++) {
                int b = sc.nextInt();
                if(i == a[b]) hit++;
                else if(a[b] > 0) blow++;
            }
            System.out.println(hit + " " + blow);
        }
    }
}

