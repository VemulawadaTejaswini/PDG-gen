import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int n = c.length;
        int[] a = new int[n];
        for(int i=0 ;i<n; i++) {
            a[i] = c[i] == '0' ? 0 : 1;
        }

        int prev = a[0];
        int rem = 0;
        for(int i=1; i<n; i++) {
            if(i == rem) {
                prev = a[i];
                continue;
            }
            if(prev != a[i]) {
                rem += 2;
            } else {
                prev = a[i];
            }
        }

        System.out.println(rem);


    }

}
