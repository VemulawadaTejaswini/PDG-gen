import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N  = Integer.parseInt(s.nextLine());
        int num = 1000 - N%1000;
        if (num == 1000){
            System.out.println(0);
        } else {
            System.out.println(num);
        }

//        int W  = Integer.parseInt(s.nextLine());
//        int K  = Integer.parseInt(s.nextLine());
        }
}