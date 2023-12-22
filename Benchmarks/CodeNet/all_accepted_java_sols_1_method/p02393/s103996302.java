import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] x = {a,b,c};
        Arrays.sort(x);
        for(int i = 0; i < 2; i++){
            System.out.printf("%d ",x[i]);
        }
System.out.printf("%d\n",x[2]);
        sc.close();
    }
}
