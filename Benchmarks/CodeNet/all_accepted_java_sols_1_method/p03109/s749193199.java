import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] splited = s.split("/");
        if(Integer.parseInt(splited[0]) < 2019) {
            System.out.println("Heisei");
            return;
        }
        if(Integer.parseInt(splited[0]) > 2019) {
            System.out.println("TBD");
            return;
        }
        if(Integer.parseInt(splited[1]) <= 4) {
            System.out.println("Heisei");
            return;
        }
        System.out.println("TBD");
    }
}
