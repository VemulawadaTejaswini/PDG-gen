

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        int h = S / 3600;
        int mm = S / 60;
        int m = mm % 60;
        int s = S % 60;

        System.out.println( h + ":" + m  + ":" + s );


	}
}
