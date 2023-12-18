import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=new int[10000];
        int b;
        int i=1;
        while(true){
            b=sc.nextInt();
            if(b==0) break;
            System.out.printf("Case %d: %d\n",i,b);
            i++;
        }
        sc.close();
    }
}
