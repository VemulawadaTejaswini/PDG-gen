import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static Scanner sc;
    public static LinkedList<Integer> list;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            list = new LinkedList<>();
            // ??°???0??§?????????
            list.add(0);
            list.add(0);
            list.add(0);
            
            String data = sc.next();
            
            int out = 0;
            int score = 0;
            
            while (out != 3) {
                String s = sc.next();
                
                switch(s) {
                    case "HIT":
                        list.add(1);
                        if (list.poll() == 1) score++;
                        break;
                    case "HOMERUN":
                        list.add(0);
                        list.add(0);
                        list.add(0);
                        if (list.poll() == 1) score++;
                        if (list.poll() == 1) score++;
                        if (list.poll() == 1) score++;
                        score++;
                        break;
                    case "OUT":
                        out++;
                }
            }
            
            System.out.println(score);
        }
    }
}