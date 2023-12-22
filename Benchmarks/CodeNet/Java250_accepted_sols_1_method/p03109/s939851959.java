import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String num[] = str.split("/");
        int year = Integer.parseInt(num[0]);
        int month = Integer.parseInt(num[1]);
        int day = Integer.parseInt(num[2]);
        if(year > 2019){
            System.out.println("TBD");
            return;
        }
        if(year == 2019 && month > 4){
            System.out.println("TBD");
            return;
        }
        System.out.println("Heisei");

    }
}