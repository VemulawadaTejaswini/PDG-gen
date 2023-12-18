import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String arg[]) {
        int deck[] = new int[50];
        int save[] = new int[50];
        int n, r, p, c, tmp, pointer;
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            r = sc.nextInt();
            if(n == 0 && r == 0) break;
            for(int i = 0; i < n; i++) deck[i] = i;
            for(int i = 0; i < r; i++){
                p = sc.nextInt();
                c = sc.nextInt();
                for(int j = 0; j < c; j++){
                    pointer = n-(p-1+c);
                    tmp = deck[pointer];
                    for(; pointer < n-1; pointer++) deck[pointer] =deck[pointer+1];
                    deck[n-1] = tmp;
                }
            }
            System.out.println(deck[n-1]+1);
        }
    }
}