import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input A B
        // B 個の差込口を確保するのに A 個の差込口があるタップを何個用意すればよいか出力せよ
        // 4 10 -> 3 (10 - 1) / (4 - 1)
        // 8 9 -> 2 (9 - 1) / (8 - 1)
        // 8 8 -> 1 (8 - 1) / (8 - 1)
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int retNum = (numB - 1) / (numA - 1);
        if((numB - 1) % (numA - 1) > 0){retNum++;}
        System.out.println(retNum);
    }
}
