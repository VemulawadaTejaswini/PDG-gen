import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numbox[ ];
        numbox = new int[128];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while((numbox[i] = sc.nextInt()) != 0)
        {
            ++i;
        }

        for(int j=0; j<i; ++j)
        {
            System.out.printf("Case %d: %d\n", j+1, numbox[j]);
        }
    }
}