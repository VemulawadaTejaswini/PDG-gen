import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int i = 0;
        while (!s.equals(dayOfWeek[i])) {
            i++;
        }
        System.out.println(7 - i);
        sc.close();
    }
}