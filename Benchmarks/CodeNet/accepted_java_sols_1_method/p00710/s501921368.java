import java.util.*;

public class Main{

    public static void main(String[] args){
        int n;
        int r;
        int p;
        int c;
        Scanner scanner = new Scanner(System.in);

        int i;
        int[] pile;
        int[] pilecopy;

        n = scanner.nextInt();
        r = scanner.nextInt();
        while(n != 0 && r != 0){
            pile = new int[n];
            pilecopy = new int[n];
            for(i = 0; i < n; i++){
                pile[i] = n - i;
            }

            for(i = 0; i < r; i++){
                p = scanner.nextInt();
                c = scanner.nextInt();

                System.arraycopy(pile, p - 1, pilecopy, 0, c);
                if(p != 1) System.arraycopy(pile, 0, pilecopy, c, p - 1);
                if(n - c - p + 1 != 0)System.arraycopy(pile, p + c - 1, pilecopy, p + c - 1, n - c - p + 1);

                System.arraycopy(pilecopy, 0, pile, 0, n);
            }

            System.out.println(pile[0]);
            
            n = scanner.nextInt();
            r = scanner.nextInt();
        }

        scanner.close();
    }
}
