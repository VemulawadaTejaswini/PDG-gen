import java.util.*;
import java.lang.*;

class Main {
    
    public static void main(String[] areg) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
		sc.close();
        
        int bit = 0;
        int free = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] < 400)
                bit |= (1 << 0);
            if (a[i] >= 400 && a[i] < 800)
                bit |= (1 << 1);
            if (a[i] >= 800 && a[i] < 1200)
                bit |= (1 << 2);
            if (a[i] >= 1200 && a[i] < 1600)
                bit |= (1 << 3);
            if (a[i] >= 1600 && a[i] < 2000)
                bit |= (1 << 4);
            if (a[i] >= 2000 && a[i] < 2400)
                bit |= (1 << 5);
            if (a[i] >= 2400 && a[i] < 2800)
                bit |= (1 << 6);
            if (a[i] >= 2800 && a[i] < 3200)
                bit |= (1 << 7);
            if (a[i] >= 3200)
                free++;
        }
        
        int count = 0;
        for (; bit != 0 ; bit &= bit - 1)
            count++;
        
        System.out.print(Math.max(1, count));
        System.out.print(" ");
        System.out.print(count + free);
    }
}