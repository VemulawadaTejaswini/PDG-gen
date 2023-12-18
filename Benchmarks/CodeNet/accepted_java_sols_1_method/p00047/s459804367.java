import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String now = "A";
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            String[] linesp = line.split(",");
            String x = linesp[0];
            String y = linesp[1];
            if(x.equals(now)) {
                now = y;
            }else if(y.equals(now)) {
                now = x;
            }
        }
        System.out.println(now);
    }
}

