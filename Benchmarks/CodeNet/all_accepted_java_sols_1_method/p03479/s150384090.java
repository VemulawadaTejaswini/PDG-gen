

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        int result = 0;


        long target = y / x;
        while(true) {
        	if(target  < 1) {
        		break;
        	}
        	target /= 2;
        	result++;
        }
        System.out.println(result);
    }
}