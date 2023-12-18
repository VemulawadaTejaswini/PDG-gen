import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int level = 0;
        if (a >= 400 && a < 600) {
            level = 8;
        } else if (a >= 600 && a < 800) {
            level = 7;
        } else if (a >= 800 && a < 1000) {
            level = 6;
        } else if (a >= 1000 && a < 1200) {
            level = 5;
        } else if (a >= 1200 && a < 1400) {
            level = 4;
        } else if (a >= 1400 && a < 1600) {
            level = 3;
        } else if (a >= 1600 && a < 1800) {
            level = 2;
        } else if (a >= 1800 && a < 2000) {
            level = 1;
        }

        System.out.println(level);
	}
}