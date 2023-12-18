import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int length;
        for(int i = 0 ; i<num ; i++){
            length = s.nextInt();
            int up = 0, down = 0;
            int[] a = new int[length];
            for(int j = 0 ; j < length ; j++)
                a[j] = s.nextInt();
            for(int k = 0 ; k+1 < length ; k++){
                if(a[k+1] - a[k] > up)
                    up = a[k+1] - a[k];
                if(a[k] - a[k+1] > down)
                    down = a[k] - a[k+1];
            }
            System.out.println(up + " " + down);
        }
    }
}