import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int [] a = new int [4];
        for (int i = 0 ; i < 4 ; i++) {
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        if (a[0] + a[1] + a[2] + a[3] == 7) {
            System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + "=7");
        } else if (a[0] - a[1] + a[2] + a[3] == 7){
            System.out.println(a[0] + "-" + a[1] + "+" + a[2] + "+" + a[3] + "=7");
        } else if (a[0] + a[1] - a[2] + a[3] == 7) {
            System.out.println(a[0] + "+" + a[1] + "-" + a[2] + "+" + a[3] + "=7");
        } else if (a[0] + a[1] + a[2] - a[3] == 7) {
            System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "-" + a[3] + "=7");
        } else if (a[0] - a[1] - a[2] + a[3] == 7) {
            System.out.println(a[0] + "-" + a[1] + "-" + a[2] + "+" + a[3] + "=7");
        } else if (a[0] - a[1] + a[2] - a[3] == 7) {
            System.out.println(a[0] + "-" + a[1] + "+" + a[2] + "-" + a[3] + "=7");
        } else if (a[0] + a[1] - a[2] - a[3] == 7 ) {
            System.out.println(a[0] + "+" + a[1] + "-" + a[2] + "-" + a[3] + "=7");
        }else {
            System.out.println(a[0] + "-" + a[1] + "-" + a[2] + "-" + a[3] + "=7");
        }
    }


}