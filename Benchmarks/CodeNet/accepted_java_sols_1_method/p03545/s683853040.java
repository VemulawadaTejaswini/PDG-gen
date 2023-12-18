import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] values = input.toCharArray();
        int a,b,c,d;
        a = values[0] - 48;
        b = values[1] - 48;
        c = values[2] - 48;
        d = values[3] - 48;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {

                    int sum = a;
                    sum += (i == 0) ? 0 - b : b;
                    sum += (j == 0) ? 0 - c : c;
                    sum += (k == 0) ? 0 - d : d;

                    if (sum == 7) {
                        String ab = (i == 0) ? "-" : "+";
                        String bc = (j == 0) ? "-" : "+";
                        String cd = (k == 0) ? "-" : "+";
                        System.out.println(a + ab + b + bc + c + cd + d + "=7");
                        return;
                    }
                }
            }
        }
    }

}