import java.util.Scanner;


// 145_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a <= 9 && b <= 9) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }

        //        HashMap<String, Integer> map = new HashMap<>();
        //        map.put("SUN", 7);
        //        map.put("MON", 6);
        //        map.put("TUE", 5);
        //        map.put("WED", 4);
        //        map.put("THU", 3);
        //        map.put("FRI", 2);
        //        map.put("SAT", 1);

    }

}
