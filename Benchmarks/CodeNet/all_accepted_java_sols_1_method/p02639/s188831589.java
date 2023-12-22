import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0 ; i<5; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<5; i++) {
            if(a[i] == 0) {
                System.out.println(i+1);
            }
        }

    }

}