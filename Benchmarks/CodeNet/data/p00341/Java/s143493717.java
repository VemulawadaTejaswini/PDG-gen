import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[12];
        for (int i = 0; i < 12; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        boolean f=true;
        for (int i=0;i<12;i+=4) {
            if (l[i]+l[i+2]!=l[i+1]+l[i+3]) {
                f=false;
                break;
            }
        }
        System.out.println(f ? "yes" : "no");
    }
}

