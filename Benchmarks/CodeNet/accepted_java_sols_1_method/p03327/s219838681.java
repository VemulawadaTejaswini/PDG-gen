//abc099a.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = "";

        if(n < 1000) num = "ABC";
        else num = "ABD";

        System.out.println(num);
        
        sc.close();
    }
}