import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();

            int[] a = new int[3];
            a[0] = n / 100;
            a[1] = n % 100;
            a[2] = a[1] % 10;
            a[1] = a[1] /10;

            for (int i = 0; i < 3; i++) {
                if(a[i] == 1){
                    a[i] = 9;
                }else if(a[i] == 9){
                    a[i] = 1;
                }
            }

            System.out.println(a[0] * 100 + a[1] * 10 + a[2]);
        }
    }
}