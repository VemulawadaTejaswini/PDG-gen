import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static Scanner sc;
    public static LinkedList<Integer> list;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list = new LinkedList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            
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