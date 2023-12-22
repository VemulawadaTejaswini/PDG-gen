import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] a = new String[h];
        for(int i = 0; i < h; i++){
            a[i] = sc.next();
        }
        int p = 0;
        for(int i = 0; i < h+2; i++){
            if(i == 0 || i == h+1){
                for(int j = 0; j < w+2; j++){
                    if(j == w+1){
                        System.out.println('#');
                    } else {
                        System.out.print('#');
                    }
                }
            } else {
                System.out.println('#' + a[p] + '#');
                p++;
            }
        }
    }
}