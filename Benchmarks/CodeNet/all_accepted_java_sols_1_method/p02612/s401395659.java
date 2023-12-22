import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        int yen = 1000;
        while(yen<payment){
            yen = yen + 1000;
        }
        System.out.println(yen - payment);
    }
}