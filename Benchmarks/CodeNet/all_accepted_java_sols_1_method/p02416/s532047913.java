import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> c = new ArrayList<>();
        while(true) {
            String s = sc.nextLine();
            if(s.equals("0")) {
                break;
            }
            int a = s.length();
            int total = 0;
            for(int i=0; i<a; i++) {
                String s1 = s.substring(i, i +1);
                int b = Integer.parseInt(s1);
                total += b;
            }
            c.add(total);
        }
        for(int d : c) {
            System.out.println(d);
        }
    }

}

