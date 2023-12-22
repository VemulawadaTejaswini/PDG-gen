import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        sc.close();

        int max = 100000;

        int[] c = new int[100001];
        c[0] = -1;
        c[1] = -1;

        for(int i = 2; i <= (int)Math.sqrt(max); i++){
            if(c[i] == 0){
                for(int j = i*i; j <= max; j = j+i){
                    c[j] = -1;
                }
            }
        }

        /* for(int i = 2; i <= max; i++){
            if(c[i] == 0)
                System.out.println(i);
        } */

        int[] s = new int[max+1];

        for(int i = 2; i <= max; i++){
            if(c[i] == 0 && c[(i+1)/2] == 0)
                s[i] = s[i-1]+1;
            else
                s[i] = s[i-1];
        }
        for(int i = 0; i < Q; i++){
            System.out.println(s[r[i]] - s[l[i]-1]);
        }
    }
}