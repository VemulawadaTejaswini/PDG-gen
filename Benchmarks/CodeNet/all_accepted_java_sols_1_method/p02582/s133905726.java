import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("");

        int count = 0;
        if (a.equals("RRR")) {
            count = 3;
        } else if (a.contains("RR")) {
            count = 2;
        } else if (a.contains("R")) {
            count = 1;
        }
        // for (int i = 0; i < b.length; i++) {
        //     if (b[i].equals("R")) {
        //         count++;
        //     }
        // }
            System.out.println(count);
        // }

    }
}