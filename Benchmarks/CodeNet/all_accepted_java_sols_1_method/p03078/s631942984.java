import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        
        long a[] = new long[x];
        long b[] = new long[y * x];
        
        int maxIndex = b.length > 3000 ? 3000 : b.length;
        long c[] = new long[maxIndex * z];

        for(int i = 0; i < x; i++){
            a[i] = sc.nextLong();
        }
        
        int count = 0;
        for(int i = 0; i < y; i++){
            long yTmp = sc.nextLong();
            for(int j = 0; j < x; j++){
                b[count] = yTmp + a[j];
                count++;
            }
        }
        
        Arrays.sort(b);
        count = 0;
        for(int i = 0; i < z; i++){
            long zTmp = sc.nextLong();
            for(int j = 0; j < maxIndex; j++){
                c[count] = zTmp + b[x * y - 1 - j];
                count++;
            }
        }
        
        Arrays.sort(c);
        
        for(int i = 0; i < k; i++){
            System.out.println(c[c.length - 1 - i]);
        }
    }
}
