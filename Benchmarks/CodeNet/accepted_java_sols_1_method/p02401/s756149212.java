
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        int x = 0;
        while (x == 0) {

            Scanner s = new Scanner(System.in);

            int[] a = new int[10000];
            int[] b = new int[10000];
            String[] op = new String[10000];
            Arrays.fill(a, 0);
            Arrays.fill(b,0);
            Arrays.fill(op,"");

            for(int i = 0; i<a.length; i++) {
                a[i] = s.nextInt();
                op[i] = s.next();
                b[i] = s.nextInt();
                if(op[i].equals("?") ){
                    break;
                }
            }
            for(int I =0; I<a.length; I++) {
                switch (op[I]) {
                    case "+":
                        System.out.println(a[I] + b[I]);
                        break;
                    case "-":
                        System.out.println(a[I] - b[I]);
                        break;
                    case "*":
                        System.out.println(a[I] * b[I]);
                        break;
                    case "?":
                        return;
                    case "/":
                        System.out.println(a[I] / b[I]);
                    default:
                        break;
                }
            }
        }
    }
}

