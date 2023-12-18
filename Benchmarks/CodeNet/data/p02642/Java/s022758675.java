import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.nextLine();
        String input = stdIn.nextLine();
        String[] b = input.split(" ");
        int[] a = new int[Integer.parseInt(n)];
        for(int i = 0 ; i < Integer.parseInt(n) ; i++){
            a[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(a);
        int c = 0;
        for (int i = a.length - 1; i > -1; i--) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }
                if (a[i] % a[j] == 0) {
                    c += 1;
                    break;
                }
            }
        }
        System.out.println(a.length - c);
    }
}
