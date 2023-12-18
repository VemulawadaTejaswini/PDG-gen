import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] l=new String[6];
        Arrays.fill(l, ":");
        while (n-- > 0) {
           int t=((int)sc.nextDouble()-160)/5;
           l[t<0?0:t>5?5:t]+="*";
        }
        for(int i=1;i<7;i++) {
            System.out.println(i+l[i-1]);
        }
    }
}
