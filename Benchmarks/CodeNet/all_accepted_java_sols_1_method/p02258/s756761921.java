import java.util.Scanner;

public class Main {

    static final int max = 200000;
    public static void main(String[]args){
        int R[] = new int[max];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++)
        {
            R[i]= scanner.nextInt();
        }

        int maxv = -2000000000; //设置一个足够小的值
        int minv = R[0];

        for (int i = 1; i<n; i++){
            maxv = Math.max(maxv,R[i]-minv);
            minv = Math.min(minv,R[i]);
        }
        System.out.println(maxv);
    }
}

