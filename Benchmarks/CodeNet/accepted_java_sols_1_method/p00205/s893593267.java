import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int[] l = {sc.nextInt()-1,0,0,0,0};
            boolean[] t = new boolean[3];
            if (l[0]<0)break;
            t[l[0]] = true;
            for (int i = 1; i < 5; i++) {
                l[i] = sc.nextInt()-1;
                t[l[i]] = true;
            }
            for (int i = 0; i < 5; i++)
                if (t[0] ^ t[1] ^ t[2])
                    System.out.println(3);
                else
                    for(int j=0;j<3;j++)
                        if(l[i]!=j&&t[l[i]]&t[j])
                           System.out.println((l[i]-j+3)%3==2?1:2);
        }
    }
}
