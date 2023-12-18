import java.io.*;
import java.util.*;

//包除原理
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        //長さnの配列の種類 10^ｎ通り
        //0と9両方が含まれない　8^n通り
        //0か9の一方が　〃　　　(9^n)*2-8^n通り
        System.out.println((long)(Math.pow(10, n)-(long)Math.pow(9, n)*2+(long)Math.pow(8, n)));
    }
}


