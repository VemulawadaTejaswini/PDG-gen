

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if((a+k-1)/k*k <= b){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        sc.close();
    }
}